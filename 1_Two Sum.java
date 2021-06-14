class Solution {
    public int[] twoSum(int[] nums, int target) {
//         Approach 1: Brute Force
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
        
//         Approach 2: One-pass Hash Table
        Map<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i]))
                return new int[] {i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        
        return new int[2];
        
        
    }
}
