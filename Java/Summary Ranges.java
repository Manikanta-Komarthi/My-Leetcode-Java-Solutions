//My Solution for Summary Ranges
//Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: The ranges are:
// [0,2] --> "0->2"
// [4,5] --> "4->5"
// [7,7] --> "7"


class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        int i=0;
        int start=0;
        while(i<nums.length){
            start=nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            if(nums[i]!=start){
                result.add(start+"->"+nums[i]);
            }else{
                result.add(String.valueOf(nums[i]));
            }
            i++;
        }
        return result;
    }
}
