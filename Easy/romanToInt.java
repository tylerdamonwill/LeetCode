class Solution {
    int conversion(char c){
        if(c == 'I'){
            return 1;
        } else if(c == 'V'){
            return 5;
        } else if(c == 'X'){
            return 10;
        } else if(c == 'L'){
            return 50;
        } else if(c == 'C'){
            return 100;
        } else if(c == 'D'){
            return 500;
        } else if(c == 'M'){
            return 1000;
        }
        return -1;
    }
    
    public int romanToInt(String s) {
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            int curVal = conversion(s.charAt(i));
            
            if(i < (s.length() - 1) &&
               (curVal < conversion(s.charAt(i + 1)))){
                    sum -= curVal;
                    curVal = 0;
                }
            
            sum += curVal;
        }
        return sum;
    }
}