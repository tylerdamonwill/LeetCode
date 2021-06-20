class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3){return 0;} //return zero if length of nums less than three
        
        int currSubArray = 0, totalSubArray = 0; // keep track of current subarrays for given index and total subarrays for nums
        for (int i=2; i < nums.length; i++) { // starts at third index and check subarrays backwards
            if (nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) { //check if entire subarray meets consecutive elements difference condition
                currSubArray += 1; // if so, add the subarray we found at current index
                totalSubArray += currSubArray; // add our subarray at current index, along with other larger subarrays we may have seen in current consective sequnce to total
            } else {
                currSubArray = 0; // our conditions isn't met, move to next index and reset currSubArray size for next index as we'll have no other larger subArrays in consecutive sequence
            }
        }
        return totalSubArray;
    }
}
