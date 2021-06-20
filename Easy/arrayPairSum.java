class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        //this problem is a lot harder with out sorting.
        // you need to check every different permutation of min(a,b) min(x,y)
        // once sorted, you'll get the largest value by getting the min of every two elements in the array
        // this check is only needed once because once sorted you know a value at index i will smaller than every value at index i + 1, therefore you don't need to check those values
        int sum = 0;
        
        for(int i = 0; i < nums.length; i += 2) {
            //sum += Math.min(nums[i], nums[i+1]); once you sort, no need to use Math.min(x,y), the smaller element will always be to the left
            sum += nums[i]; //grab the smaller value
        }
        
        return sum;
    }
}
