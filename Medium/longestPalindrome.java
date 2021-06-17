/*

Spotting a pattern
        i,j
        0,3
        0,2
        0,1
        1,3
        1,2
        2,3
        [babad]
        [01234]
*/

class Solution {
    
    boolean isPalindrome(String str, int head, int tail){
        while(head < tail){
            if(str.charAt(head++) != str.charAt(tail--)){ return false; }
        }
        return true;
    }
    
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){return s;}
        
        String longerSoFar = s.substring(0, 1);
        
        for(int i = 0; i < s.length(); i++){
            for(int j = s.length() - 1; j > i; j--){
                if(longerSoFar.length() < (j - i +1)){
                    if(isPalindrome(s, i, j)){
                        longerSoFar = s.substring(i, j+1);
                    }
                }
            }
        }
        
        return longerSoFar; 
    }
}