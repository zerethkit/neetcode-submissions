class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                List<String> chain = new ArrayList<>();
                chain.add(s);
                map.put(sorted, chain);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        map.forEach((k, v) -> ans.add(v));
        return ans;
    }         
}
