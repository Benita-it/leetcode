#148. Sort List
🔗 Problem Link
📁 Topic: Linked List, Merge Sort, Recursion, Divide and Conquer

Approach: Use Merge Sort. Split the list into two halves using fast and slow pointers, recursively sort both halves, then merge them using the merge function.

Time Complexity: O(n log n)
Space Complexity: O(log n)

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
import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        // Check if the list is empty or has only one node, if so, it's already sorted! 🚀
        if (head == null || head.next == null) {
            return head; 
        }

        // Find the middle of the list so we can split it in half. 🔪
        ListNode middle = getMiddle(head);
        // Grab the node right after the middle, which will be the start of the second half.
        ListNode nextOfMiddle = middle.next;
        // Cut the link between the first and second halves, making them independent lists. ✂️
        middle.next = null;

        // Recursively sort the two halves. Magic! ✨
        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);

        // Merge the two sorted halves into one big sorted list. 🤝
        ListNode sortedList = merge(left, right);
        return sortedList;
    }
}