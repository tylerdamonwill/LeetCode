class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < nums.length; i++){
            int endOfSorted = i;
            while(endOfSorted < (nums.length - 1) && nums[endOfSorted] == (nums[endOfSorted+1]-1)){
                endOfSorted++;
            }
            if(i == endOfSorted){
                list.add(String.valueOf(nums[i]));
            } else {
                list.add(String.valueOf(nums[i]) +"->"+String.valueOf(nums[endOfSorted]));
                i=endOfSorted;
            }
        }
        
        return list;
    }
}