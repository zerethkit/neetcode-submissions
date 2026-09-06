class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int midIndex = low + (high - low) / 2;
            if (target == nums[midIndex]) return midIndex;
            else if (target < nums[midIndex]) {
                high = midIndex - 1;
            } else {
                low = midIndex + 1;
            }
        }
        return -1;
    }
}
