class Solution {
    public int maxArea(int[] height) {
    int h = 0;
    int left = 0;
    int right = height.length-1;
    int maxArea = 0;
    int len=0;
    while(left < right){
        h = Math.min(height[left],height[right]);
        len = right - left; 
        maxArea = Math.max(maxArea , h*len);
        if(height[left] < height[right]){
             left++;
        }
        else{
            right--;
        }
            }
            return maxArea;
    }
}