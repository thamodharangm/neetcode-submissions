class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int maxWater=0;

        while(left<right){
            int width=right-left;
            int minHeights=Math.min(heights[left],heights[right]);
            int area=width*minHeights;

        maxWater=Math.max(maxWater,area);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
