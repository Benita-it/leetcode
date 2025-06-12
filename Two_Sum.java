#1. Two Sum

🔗 Problem Link (https://leetcode.com/problems/two-sum/)
📁 Topic: Hash Map, Array

✅ Steps:
1️⃣ Traverse through the array once using a for loop.
2️⃣ For each number, calculate the complement (target - current number).
3️⃣ Check if this complement is already in the map:
  🔹 If yes, return the indices of complement and current number.
  🔹 If no, store the number with its index in the map.
4️⃣ If no pair found by the end of loop, return an empty array.

🧠 Logic:
Instead of checking all pairs (brute force), we use a HashMap to store the numbers we have seen so far.

This allows constant-time lookup for the complement.

🧪 Example:
java
Copy
Edit
nums = [2, 7, 11, 15], target = 9
🧮

i = 0 → complement = 9 - 2 = 7 → not in map → store (2, 0)

i = 1 → complement = 9 - 7 = 2 → found in map! → return [0, 1]

➡️ Output: [0, 1]

⏱ Time Complexity: O(n)
→ We traverse the array once and perform constant-time operations.

🧠 Space Complexity: O(n)
→ In the worst case, we store all n numbers in the HashMap.


import java.util.HashMap;
import java.util.Map;
class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{}; 
    }
}