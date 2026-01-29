class Solution {
    public int largestRectangleArea(int[] heights) {
        int height =0;
       int n = heights.length;
       int area =0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<=n;i++){
            
            if(i == n){
             height = 0;
            }
            else{
                height = heights[i];
            }
            while(!st.isEmpty() && height < heights[st.peek()]){
                int h = heights[st.pop()];
               int w;
               if(st.isEmpty()){
                w = i;
               }
               else{
                w = i - st.peek() - 1;
               }
           area = Math.max(area, h * w);
            }
            st.push(i);
        }
        return area;
    }
}