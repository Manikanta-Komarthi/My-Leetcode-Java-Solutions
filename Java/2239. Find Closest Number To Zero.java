class Solution {
    public int findClosestNumber(int[] nums) {
        int num=nums[0];
        int temp=num;
        for(int i=0;i<nums.length;i++){
            temp=num;
            if(Math.abs(nums[i])<=Math.abs(num)){
                num=nums[i];
                if(nums[i]<temp && Math.abs(nums[i])==temp)
                num=temp;
            }
        }
        return num;
    }
}
