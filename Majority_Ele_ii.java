# Majority Element II (LeetCode #229)

🔗 Problem Link(https://leetcode.com/problems/majority-element-ii/)


---

## ✅ Approach

This solution uses a modified **Boyer-Moore Voting Algorithm**, optimized to find all elements that appear more than ⌊n/3⌋ times.

### Key Observations:

- There can be **at most 2 majority elements** in this case.
- First loop: Identify 2 potential candidates.
- Second loop: Count the actual occurrences of the candidates to verify.

---

## Algorithm Steps

1. **Initialize** two candidate variables and their respective counters.
2. **First Pass**:
   - Track two potential majority elements by increasing/decreasing counts.
3. **Second Pass**:
   - Count the actual frequency of the two candidates.
4. **Return** the ones that appear more than ⌊n/3⌋ times.

Time Complexity    O(n)           
Space Complexity   O(1) (excluding result list) 



import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0, cnt1 = 0, cnt2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                cnt1++;
            } else if (num == candidate2) {
                cnt2++;
            } else if (cnt1 == 0) {
                candidate1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                candidate2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == candidate1) cnt1++;
            else if (num == candidate2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (cnt1 > nums.length / 3) ans.add(candidate1);
        if (cnt2 > nums.length / 3) ans.add(candidate2);

        return ans;
    }
}
