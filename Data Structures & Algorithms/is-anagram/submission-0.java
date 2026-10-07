class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() - t.length() != 0) return false;
        int[] set = new int[26];
        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i) - 'a']++;
            set[t.charAt(i) - 'a']--;
        }
        for (int i : set) {
            if (i != 0) return false;
        }
        return true;
    }
}
