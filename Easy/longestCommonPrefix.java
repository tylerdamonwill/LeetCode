class Solution {
    Boolean isMatch(String[] strs, int index){
        char current = strs[0].charAt(index);
        
        for(int i = 0; i < strs.length; i++){
            if(strs[i].charAt(index) != current){ return false; }
        }
        
        return true;
    }
    
    public String longestCommonPrefix(String[] strs) {
        int shortest = Integer.MAX_VALUE;
        String str = new String("");
        
        for(int i = 0; i < strs.length; i++){
            shortest = Math.min(strs[i].length(), shortest);
        }
        
        for(int i = 0; i < shortest; i++){
            if(isMatch(strs ,i)){
                str += strs[0].charAt(i);
            } else {return str;}
        }
        
        return str;
    }
}