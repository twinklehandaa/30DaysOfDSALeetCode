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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur!=null && cur.next!=null){
            ListNode one = cur.next.next;
            ListNode two = cur.next;

            two.next = cur;
            cur.next = one;
            prev.next = two;

            prev = cur;
            cur = one;
        }
        return dummy.next;
    }
}

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
