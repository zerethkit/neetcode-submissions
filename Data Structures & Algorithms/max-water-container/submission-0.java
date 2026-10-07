class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int maxArea = 0;
        while (i <= j) {
            int area = Math.min(heights[i], heights[j]) * (j - i);
            if (area > maxArea) {
                maxArea = area;
            } 
            if (Math.min(heights[i], heights[j]) == heights[i]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
