class Solution {
    //queue
    public int timeRequiredToBuy(int[] tickets, int k) {
      Queue<Integer> qu = new LinkedList<>();
      for(int i =0;i<tickets.length;i++){
        qu.offer(i);
      } 
      int time =0;
      while(true){
        int p = qu.poll();
        tickets[p]--;
        time++;
        if(p == k && tickets[p]== 0){
            return time;
        }
        if(tickets[p]>0)
        qu.offer(p);
      } 
    }
}