class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0, curr = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curr++;
            }
        }
        maxVowels = curr;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) curr++;
            if (isVowel(s.charAt(i - k))) curr--;
            maxVowels = Math.max(maxVowels, curr);
            // early exit
            if (maxVowels == k) return k;
        }
        return maxVowels;
    }
    
    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}