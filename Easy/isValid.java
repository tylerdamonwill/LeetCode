class Solution {
    boolean isEnd(char s){
        if(s == ')' ||
           s == ']' ||
           s == '}'){
            return true;
        }
        return false;
    }
    
    boolean isMatch(char t, char s){
        if(t == '(' && s == ')'){ return true;}
        if(t == '[' && s == ']'){ return true;}
        if(t == '{' && s == '}'){ return true;}
        return false;
    }
    
    public boolean isValid(String s) {
        
        Stack<Character> parens = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if (isEnd(cur)){
                if(parens.empty()){ return false; }
                
                char lastPushed = parens.pop();
                if(!isMatch(lastPushed, cur)){
                    return false;
                }
            } else { parens.push(cur); }
        }
        
        if(parens.empty()){return true;}
        return false;
    }
}