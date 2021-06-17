class Solution {
    public String maximumTime(String time) {
        char[] nums = time.toCharArray();
        
        if (nums[0] == '?' && nums[1] == '?') {
            nums[0] = '2'; nums[1] = '3';
        } else if (nums[0] == '?') {
            nums[0] = (nums[1] > '3') ? '1' : '2';
        } else if (nums[1] == '?') {
            nums[1] = (nums[0] < '2') ? '9' : '3';
        }
        
        if (nums[3] == '?') nums[3] = '5';
        if (nums[4] == '?') nums[4] = '9';
        
        return new String(nums);
    }
}