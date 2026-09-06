class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int currArea = 0;
        int maxArea = 0;

        while (i < j) {
            if (heights[i] < heights[j]) {
                currArea = (j - i) * heights[i];
                if (currArea > maxArea) {
                    maxArea = currArea;
                }
                i++;
            } else {
                currArea = (j - i) * heights[j];
                if (currArea > maxArea) {
                   maxArea = currArea;
                }
                j--;
            }
        }
        return maxArea;
    }
}
