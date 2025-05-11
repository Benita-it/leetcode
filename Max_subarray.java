#53. Maximum Subarray
🔗 Problem Link: (https://leetcode.com/problems/maximum-subarray/)
📁 Topic: Dynamic Programming, Kadane’s Algorithm

sum < 0 → reset sum to 0 (because negative prefix will reduce total)
sum += n → include current number in subarray
max = Math.max(max, sum) → keep updating the max sum seen so far

Time Complexity: O(n)
Space Complexity: O(1)

import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int n:nums){
            if(sum<0){
                sum=0;
            }
        sum+=n;
        max=Math.max(max,sum);
        }
        return max;
    }
}