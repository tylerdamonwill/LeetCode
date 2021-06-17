class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0){return 0;}
        if (nums.length == 1){return 1;}
        
        int lastOfNewNum = 0;
      
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                nums[lastOfNewNum++] = nums[i];
            }
        }
      
        nums[lastOfNewNum++] = nums[nums.length-1];
        
        return lastOfNewNum;
    }
}