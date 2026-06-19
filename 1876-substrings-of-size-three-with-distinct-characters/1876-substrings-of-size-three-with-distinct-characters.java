class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            if (j - i + 1 == 3) { // length of the window i j start n end ind 
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                char c = s.charAt(i + 2);

                if (a != b && b != c && a != c) {
                    count++;
                }
                i++;
            }
        }
        return count;
    }
}