#21. Merge Two Sorted Lists
🔗 Problem Link (https://leetcode.com/problems/merge-two-sorted-lists/)
📁 Topic: Linked List, Recursion

🧠 Logic:
Youre given two sorted linked lists.

Merge them into one sorted list by comparing nodes one by one.

Use recursion to keep merging the remaining parts of the list.

🪜 Steps:
Base Cases:

If l1 is null, return l2 (because l1 is empty).

If l2 is null, return l1.

Recursive Case:

If l1.val < l2.val: set l1.next to merged result of l1.next and l2, return l1.

Else: set l2.next to merged result of l1 and l2.next, return l2.

💡 Example:
Input:
l1 = 1 -> 2 -> 4
l2 = 1 -> 3 -> 4

Output:
1 -> 1 -> 2 -> 3 -> 4 -> 4

⏱️ Time Complexity: O(n + m)
You visit every node from both lists once.

🧠 Space Complexity:
O(n + m) due to recursion stack (if lists have n and m nodes).

To avoid stack overflow, consider an iterative solution.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}