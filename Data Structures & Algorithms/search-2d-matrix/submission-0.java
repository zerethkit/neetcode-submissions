class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int leftIndex = 0, rightIndex = rows * cols - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int midElement = matrix[midIndex/cols][midIndex%cols];
            if (target == midElement) {
                return true;
            } else if (target < midElement) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return false;
    }
}
