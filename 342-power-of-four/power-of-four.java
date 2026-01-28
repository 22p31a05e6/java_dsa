class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n ==1){
            return true;
        }
        while(n>=2){
            int k = n%4;
            if(k != 0){
                return false;
            }
            n = n/4;
        }
        return true;
    }
}