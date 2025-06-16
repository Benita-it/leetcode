#387. First Unique Character in a String
🔗 Problem Link (https://leetcode.com/problems/first-unique-character-in-a-string)
📁 Topic: String, Hash Table, Queue

Approach
Count Frequencies
Use an array of size 26 to count the occurrences of each character in the string.

Find First Unique Character
Make a second pass over the string to find the first character with a frequency of 1.

Time Complexity
🕒 O(n)

Two linear passes over the string.

Space Complexity
🧠 O(1)

Constant space: fixed-size array for 26 lowercase letters.

import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26]; // Count for each letter

        // First pass: count character frequencies
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Second pass: find the first character with count == 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }
}