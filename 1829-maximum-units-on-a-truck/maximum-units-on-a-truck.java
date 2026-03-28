class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1] - a[1]);
        int max =0;
      for(int box[] : boxTypes){
         if(truckSize >= box[0]){
            max = max + box[1]*box[0];
            truckSize = truckSize - box[0];
         }
         else {
            max = max + box[1]*truckSize;
            return max;
         }
      }
      return max;
    }
}