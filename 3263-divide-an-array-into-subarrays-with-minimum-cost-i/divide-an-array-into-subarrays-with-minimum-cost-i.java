class Solution {
    public int minimumCost(int[] nums) {
        int cost =nums[0];
        
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(s>nums[i]){
                f= s;
                s =nums[i];

            }else if(nums[i]<f){
                f =nums[i];
            }
        }
        if(nums.length>2)
        return cost+f+s;
        
        return cost+cost+nums[nums.length-1];
    }
}