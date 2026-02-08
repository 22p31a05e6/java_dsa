class Solution {
    public int dominantIndices(int[] nums) {
     int n = nums.length;
        int count = 0;

        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        for(int i = 0; i < n - 1; i++) {

            sum -= nums[i];   

            int rightCount = n - i - 1;

            if(nums[i] > (double)sum / rightCount) {
                count++;//sum
            }
        }

        return count;   
    }
}