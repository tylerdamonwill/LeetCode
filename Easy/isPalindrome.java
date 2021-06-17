class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){return false;}
        
        int orig = x, remainder, reversed = 0;
        
        while(orig != 0){
            remainder = orig % 10;
            reversed = reversed * 10 + remainder;
            orig /= 10;
        }
        
        
        if(reversed == x){
            return true;
        }
        
        return false;
    }
}