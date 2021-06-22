class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<Character>(), tStack = new Stack<Character>();
        int index = 0;
        
        while(index < s.length() || index < t.length()){
            if(index < s.length()) {
                if(s.charAt(index) == '#'){
                    if(!sStack.empty()){sStack.pop();}
                } else {
                    sStack.push(s.charAt(index));   
                }
            }
            
            if(index < t.length()) {
                if(t.charAt(index) == '#'){
                    if(!tStack.empty()){tStack.pop();}
                } else {
                    tStack.push(t.charAt(index));   
                }
            }
            
            index++;
        }

        boolean ans = sStack.equals(tStack) ? true : false;
        return ans;
    }
}
