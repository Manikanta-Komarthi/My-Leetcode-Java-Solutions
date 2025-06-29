//Solution for Binary Subarray With Sum Using Hashmap;

// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - goal, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
