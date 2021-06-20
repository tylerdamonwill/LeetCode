class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        
        for(int i = 0; i < sentence.length(); i++){
            seen[sentence.charAt(i) - 97] = true;
        }
        
        for(int i = 0; i < seen.length; i++){
            if(seen[i] == false){return false;}
        }
        
        return true;
    }
}
