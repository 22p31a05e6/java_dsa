class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> st = new Stack<>();
       for(int i=0;i<temperatures.length;i++){
        while(!st.isEmpty() && temperatures[st.peek()] <temperatures[i] ){
            temperatures[st.peek()] = i - st.peek();
            st.pop();
        }
        st.push(i);
       } 
       while(!st.isEmpty()){
        temperatures[st.peek()] = 0;
        st.pop();
       }
       return temperatures;
    }
}