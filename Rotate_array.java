#189. Rotate Array

🔗 [Problem Link](https://leetcode.com/problems/rotate-array/)
📁 Topic: Array, Two Pointers

**Approach**: Reverse the entire array, then reverse first `k` and last `n-k` elements.
              Rotate() is the main function to rotate the array.
              Reverse() is the helper function to reverse the elements in the array.
**Time Complexity**: `O(n)`
**Space Complexity**: `O(1)`

import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}