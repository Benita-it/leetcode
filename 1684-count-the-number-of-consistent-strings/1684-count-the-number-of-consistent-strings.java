class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        // Store all allowed characters
        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int cnt = 0;

        // Check each word
        for (String word : words) {
            boolean isConsistent = true;

            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                cnt++;
            }
        }

        return cnt;
    }
}