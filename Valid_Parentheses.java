#20. Valid Parentheses
🔗 Problem Link (https://leetcode.com/problems/valid-parentheses/)
📁 Topic: Stack, String

🧠 Logic:
Use a stack to keep track of expected closing brackets.

When encountering an opening bracket ((, [, {), push its corresponding closing bracket (), ], }) to the stack.

When encountering a closing bracket:

If the stack is empty or the top of the stack doesnt match the current character, the string is invalid.

After processing all characters, the stack should be empty for the string to be valid.

 Steps:
Loop through each character in the string:

If its an opening bracket, push the expected closing bracket onto the stack.

If its a closing bracket:

Return false if the stack is empty or the top doesnt match.

Return true if the stack is empty after the loop.

💡 Example:
Input: s = "({[]})"
Stack Trace:

Read '(': push ')'
Read '{': push '}'
Read '[': push ']'
Read ']': matches with top -> pop
Read '}': matches with top -> pop
Read ')': matches with top -> pop
✅ Final Stack: empty → return true

⏱️ Time Complexity: O(n)
You traverse each character once.

🧠 Space Complexity: O(n)
In worst case, all characters are opening brackets, so stack stores all of them.


import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                st.push(')');
            else if(c=='[')
                st.push(']');
            else if(c=='{')
                st.push('}');
            else if(st.isEmpty() || st.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
}