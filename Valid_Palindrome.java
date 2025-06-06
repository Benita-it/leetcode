#125. Valid Palindrome
🔗 Problem Link (https://leetcode.com/problems/valid-palindrome/)
📁 Topic: Two Pointers, String

🧠 Idea:
Use two pointers: one from the start and one from the end

Ignore all non-alphanumeric characters

Compare remaining characters in lowercase

If any mismatch → ❌ Not a palindrome

If everything matches → ✅ Palindrome

🪜 Steps:
left = 0, right = s.length() - 1

While left <= right:

If s[left] is not a letter or digit → left++

Else if s[right] is not a letter or digit → right--

Else:

If Character.toLowerCase(s[left]) != Character.toLowerCase(s[right]) → return false

Else → left++, right--

Return true

🔍 Example:
Input: "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" → ✅ Palindrome

Input: "race a car"
Output: false
Explanation: "raceacar" → ❌ Not a palindrome

⏱ Time Complexity: O(n)
📦 Space Complexity: O(1)



class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char currFirst=s.charAt(left);
            char currLast=s.charAt(right);
            if(!Character.isLetterOrDigit(currFirst)){
                left++;
            }
            else if(!Character.isLetterOrDigit(currLast)){
                right--;
            }
            else{
                if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}