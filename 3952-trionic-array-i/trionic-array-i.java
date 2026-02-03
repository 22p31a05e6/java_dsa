class Solution {
    public boolean isTrionic(int[] nums) {
        int count  = 0;
        int  i =0;
       
        while(i< nums.length-1 && nums[i] <nums[i+1]  ){
            i++; 
            count++;
        }
        int m = count ;
        while( i< nums.length-1 && nums[i] >nums[i+1] && count > 0 ){
            i++;
            count++ ;
        }
        if(count > m){
        count = -1;
        }
        while( i< nums.length-1 && nums[i] <nums[i+1] && count < 0 ){
            i++;
            count -- ;
       }
       if( i == nums.length -1 && count < -1 ){
        return true;
       }
       return false;
    }
}