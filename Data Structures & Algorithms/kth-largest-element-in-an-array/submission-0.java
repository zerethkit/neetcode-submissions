class Solution {
    public int findKthLargest(int[] nums, int k) {
        int index = nums.length - k;    
        return quickSelect(nums, 0, nums.length - 1, index);
    }

    private int quickSelect(int[] A, int low, int high, int index) {
        int p = partition(A, low, high);
        if (p == index) {
            return A[p];
        } else if (p < index) {
            return quickSelect(A, p + 1, high, index);
        } else {
            return quickSelect(A, low, p - 1, index);
        }
    }

    private int partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j] <= pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;
        return i + 1;
    }
}
