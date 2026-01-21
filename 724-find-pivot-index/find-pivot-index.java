class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int pSum = 0;
        if(nums.length == 1 ){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
           sum = sum+ nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            pSum = pSum+nums[i];
            if((sum-pSum)==0 && i == 0){
                return 0;
            }
             if(pSum == (sum-pSum-nums[i+1])){
                return i+1;
             }
        }
        return -1;
    }
}