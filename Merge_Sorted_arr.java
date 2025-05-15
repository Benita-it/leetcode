#88. Merge Sorted Array
🔗 Problem Link (https://leetcode.com/problems/merge-sorted-array/)
📁 Topic: Arrays, Two Pointers, Sorting

Steps:
1️⃣ Copy elements of nums2 into nums1 starting from index m.
2️⃣ Use Arrays.sort() to sort the combined array in-place.
3️⃣ The result is a single merged, sorted array stored in nums1.

Time Complexity: O((m + n) log (m + n)) (due to sorting)
Space Complexity: O(1) (in-place)

import java.util.Arrays;
import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
