#31.Next Permutation

🔗 Problem Link: (https://leetcode.com/problems/next-permutation/)
📁 Topic: Arrays, Two Pointers, Greedy

nums[i] < nums[i+1] → used to find the "breakpoint"
Reverse(nums, i+1, n-1) → to make the suffix the smallest possible
Swap(nums[i], nums[j]) → to get the next bigger arrangement

Time Complexity: O(n)
Space Complexity: O(1)

import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;   
        while (i >= 0 && nums[i] >= nums[i + 1]) 
            i--;
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) 
                j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, i + 1, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}