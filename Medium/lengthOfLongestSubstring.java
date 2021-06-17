class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*if(s.length() == 0){return 0;}
        
        int max = 1;
        
        for(int i = 0; i < s.length(); i++){
            Set<Character> currentSub = new HashSet<Character>();
            for(int j = i; j < s.length(); j++){
                char cur = s.charAt(j);
                if(currentSub.contains(cur)){
                    break;
                } else {
                    currentSub.add(cur);
                }
            }
                max = Math.max(max, currentSub.size());    
            }
        return max;*/
        
        		int len = s.length();
		int i = 0;
		int j = 0;
		boolean[] visited = new boolean[256];
		int maxLen = 0;
		while (j < len){
			if (visited[s.charAt(j)]){//if already visited
				maxLen = Math.max(maxLen, j-i);
				while (s.charAt(i) != s.charAt(j)){
					visited[s.charAt(i)] = false;
					i++;
				}
				i++;
			}
			else{//if not visited
				visited[s.charAt(j)] = true;
			}
			j++;
		}
		maxLen = Math.max(maxLen, len - i);
		return maxLen;  
    }
}