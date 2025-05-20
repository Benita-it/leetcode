#56. Merge Intervals

🔗 Problem Link(https://leetcode.com/problems/merge-intervals/)
📁 Topic: Arrays, Sorting, Merge Intervals

Steps:
1️⃣ Sort intervals by start time using Arrays.sort().
2️⃣ Iterate and merge overlapping intervals into a new list.
3️⃣ Add non-overlapping intervals directly to the result.
4️⃣ Return result as a 2D array.

Time Complexity: O(n log n) (for sorting)
Space Complexity: O(n) (for output list)

import java.util.*;
import java.io.*;

 class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Sort by Start Time: 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Initialize: 
        List<int[]> merged = new ArrayList<>();  // To store the merged intervals
        int[] current = intervals[0];            // Start with the first interval

        // 3. Iterate and Merge: 
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // Check for Overlap:
            if (next[0] <= current[1]) {
                // Overlap!  Merge them. 
                current[1] = Math.max(current[1], next[1]);// Extend curr interval
            } else {
                // No Overlap!  The current interval is complete. ✅
                merged.add(current); // Add the current interval to the result
                current = next;// Start a new interval
            }
        }

        // 4. Add the Last Interval: ➕
        merged.add(current);  // Don't forget the last one!

        // 5. Convert to Array: ➡️
        return merged.toArray(new int[merged.size()][]); 
        // Change from List to int[][]
    }
}