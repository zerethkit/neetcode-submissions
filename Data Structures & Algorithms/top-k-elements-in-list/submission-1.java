class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.merge(i, 1, (a, b) -> a + b);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);
            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int counter = 0;
        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int num : buckets[i]) {
                result[counter++] = num;
                if (counter == k) {
                    return result;
                }
            }        
        }
        return result;
    }
}
