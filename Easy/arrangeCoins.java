class Solution {
    public int arrangeCoins(int n) {
        int curRow = 1;
        
        while(n > 0){
            if(n < curRow){return curRow - 1;}
            n -= curRow;
            curRow++;
        }
        
        return curRow - 1;
    }
}
//seems like a job for a factorial helper now that I only beat 37% of submissions 🤦🏽‍♂️
