class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);    
            }
        }
        String t = sb.toString().toLowerCase();
        
        int i = 0, j = t.length() - 1;
        while (i <= j) {
            if (t.charAt(i) != t.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
