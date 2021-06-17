class Solution {
    public boolean checkOnesSegment(String s) {
        boolean sawZero = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                sawZero = true;
            } else if (s.charAt(i) == '1' && sawZero){
                return false;
            }
        }
        
        return true;
    }
}