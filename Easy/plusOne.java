class Solution {
    public int[] plusOne(int[] digits) {
        int place = digits.length - 1, temp = digits[place] + 1, remainder = 0;
        remainder = temp > 9 ? 1 : 0;
        digits[place] = temp % 10;
            
        while(remainder > 0){
            place--;
            if(place < 0){
                int newarr[] = new int[digits.length  + 1];
                newarr[0] = 1;
                for (int i = 1; i < newarr.length; i++) {newarr[i] = digits[i-1];}
                return newarr;
            }
            temp = digits[place] + remainder;
            digits[place] = temp % 10;
            if(temp < 10){
                remainder--;
            }
        }
        
        if(remainder > 0){
            
        }
        
        return digits;
    }
}