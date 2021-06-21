class Solution {
    
    boolean isArithmetic(int[] nums, int head, int tail){
        int copy[] = Arrays.copyOfRange(nums, head, tail + 1);//create seperate subarray to sort
        Arrays.sort(copy); //sort array to make arithmetic check an O(n) operation moving forward, your solution needs the add the time coplexity of soritng algorithm behind Arrays.sort
        tail = copy.length-1;
        int diff = copy[tail] - copy[--tail];//save time by moving tail when getting coparison int
        while(tail > 0){ //this will not run for subarrays of length n < 1
            if(copy[tail] - copy[--tail] != diff){return false;} // check if subarray remains arithmetic, if not return false
        }
        return true;
    }
    
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> checks = new ArrayList<Boolean>();

        for(int i = 0; i < l.length; i++){
            checks.add(isArithmetic(nums, l[i], r[i]));//check all indexs from l and r, from l[i] to r[i]
        }
        
        return checks;
    }
}
