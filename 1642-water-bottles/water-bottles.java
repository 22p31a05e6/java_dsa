class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles >=numExchange){
            int tep = numBottles ;
            numBottles = numBottles/numExchange ;
         
            total = total +  numBottles ;
            numBottles = numBottles + (tep % numExchange );
            
        }
        return total;
    }
}