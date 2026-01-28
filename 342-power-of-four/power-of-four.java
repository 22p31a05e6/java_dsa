/*class Solution {
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
}*/
class Solution {
    public boolean isPowerOfFour(int n) {
        // 1) n > 0
        // 2) only one bit set (power of 2)
        // 3) that bit is in even position
        return n > 0 
            && (n & (n - 1)) == 0 
            && (n & 0x55555555) != 0;
    }
}
