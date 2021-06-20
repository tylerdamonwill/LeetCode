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
