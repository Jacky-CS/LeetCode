// Running time: 2 ms
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start = -1, end = -1, count = 0;
        for(int i=0; i<nums.length; i++){

            if(nums[i] < left) // ok_value
                count += end - start;

            else if(nums[i] <= right){ //need_value
                end = i;
                count += end - start;
            }

            else{  // reset_value
                start = i;
                end = i;
            }
        }
        return count;
    }
}
