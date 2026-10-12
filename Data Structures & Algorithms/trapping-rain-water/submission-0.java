class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] volume = new int[n];

        int maxSoFar = 0;
        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(height[i], maxSoFar);
            leftMax[i] = maxSoFar;
        }        

        maxSoFar = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxSoFar = Math.max(height[i], maxSoFar);
            rightMax[i] = maxSoFar;
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            volume[i] = Math.min(leftMax[i], rightMax[i]) - height[i];
            total += volume[i];  
        }
        return total;
    }
}
