#494. Target Sum
🔗 Problem Link (https://leetcode.com/problems/target-sum/)
📁 Topic: Recursion, Backtracking

Steps:
1️⃣ Use recursion to explore every possible combination of + and - for each element in the array.
2️⃣ Keep track of:
  🔸 current index (to know where we are in the array)
  🔸 current sum (to know the total after adding/subtracting)
3️⃣ At each step, do two recursive calls:
  🔹 One by adding the current number to sum
  🔹 One by subtracting the current number from sum
4️⃣ Once the index reaches the end of the array:
  ✅ If the final sum equals the target → count it as 1 valid way
  ❌ Else → count it as 0
5️⃣ Total number of ways = sum of all valid paths that lead to target

Example:
🧪 Input: nums = [1, 1, 1], target = 1
All possible combinations of + and -:

+1 +1 -1 = 1 ✅

+1 -1 +1 = 1 ✅

-1 +1 +1 = 1 ✅
➡️ Total valid ways = 3

⏱ Time Complexity: O(2^n)
→ Every number has 2 choices (+ or -), leading to 2^n combinations

🧠 Space Complexity: O(n)
→ Due to recursive stack (depth = number of elements)

import java.util.*;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    private int helper(int[] arr,int target,int idx,int sum){
        if(idx >= arr.length)
            return sum==target ? 1:0;
        int subtract=helper(arr,target,idx+1,sum-arr[idx]);
        int add=helper(arr,target,idx+1,sum+arr[idx]);
         return subtract + add;
    }
}