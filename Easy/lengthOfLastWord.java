class Solution {
    public int lengthOfLastWord(String s) {
        int spaces = 0;
        
        int i = s.length() - 1;
        while(i > -1 && s.charAt(i) == ' '){
            i--;
        }
        
        for(int j = i; j > -1; j--){
            if(s.charAt(j) == ' ' && spaces != 0){
                return spaces;
            }
            spaces++;
        }
        
        return spaces;
    }
}