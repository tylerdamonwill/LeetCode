class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char lastLargest = letters[0];
        for(int i = letters.length-1; i > -1; i--){
            if(letters[i] > target){
                lastLargest = letters[i];
            } else {
                return lastLargest;
            }
        }
        return lastLargest;
    }
}