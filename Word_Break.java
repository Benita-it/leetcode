#139. Word Break
🔗 Problem Link(https://leetcode.com/problems/word-break/)
📁 Topic: Dynamic Programming, String, HashSet

🔎 Approach
Use Dynamic Programming (Bottom-Up Tabulation) to check whether the string can be segmented.

Use a boolean dp array where dp[i] is true if substring s[0...i-1] can be segmented.

Use a HashSet for faster word lookup.

Optimize inner loop by limiting the substring length to the maximum word length in the dictionary.

🧮 Steps
Initialize a HashSet wordSet from wordDict for O(1) lookup.

Find the maximum word length maxLen to optimize inner loop.

Initialize dp[0] = true (empty string can always be segmented).

For each position i, check all substrings ending at i of length up to maxLen.

If any substring s[j...i-1] exists in wordSet and dp[j] is true, set dp[i] = true.

📝 Example
s = "leetcode", wordDict = ["leet","code"]

dp[0] = true

At i=4, substring "leet" found, dp[4] = true

At i=8, substring "code" found, dp[8] = true

Final result: dp[8] = true → can segment

⏰ Time Complexity
O(n * maxLen) — where n is string length, maxLen is the longest word length.

📦 Space Complexity
O(n + m) — for DP array and word set (m is total wordDict size).

import java.util.HashSet;
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        int maxLen=0;  // Find the maximum word length
        for(String word:wordDict){
            maxLen=Math.max(maxLen,word.length());
        }
        int n=s.length();
        boolean[] dp= new boolean[n+1];
        dp[0]=true; // base case: empty string

        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-maxLen);j--){
                if(dp[j] && wordSet.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}