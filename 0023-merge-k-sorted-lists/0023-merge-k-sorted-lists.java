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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        int s=1;
        while(s<lists.length){
            for(int i=0; i<lists.length-s; i += s*2){
                lists[i] = merge(lists[i], lists[i+s]);
            }
            s *= 2;
        }
        return lists[0];
    }

    public ListNode merge(ListNode l, ListNode r){
        ListNode h = new ListNode(0);
        ListNode curr = h;
        while(l != null && r != null){
            if(l.val < r.val){
                curr.next = l;
                curr = l;
                l = l.next;
            }
            else{
                curr.next = r;
                curr = r;
                r = r.next;
            }
            
        }
        if(l != null) curr.next = l;
        if(r != null) curr.next = r;
        return h.next;
    }
}