class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] nums = new int [num_people];
        int store = candies;
        int count = 1;

        for(int i = 0; i < num_people; i++) {
            nums[i] = 0;
        }

        while(store > 0) {
            for(int i = 0; i < num_people; i++) {
                if(store < count) {
                    nums[i] = nums[i] + store;
                    store = 0;
                    break;
                } else {
                    nums[i] = nums[i] + count;
                    store = store - count;
                    count++;
                }
            }

        }
        return nums;
    }
}