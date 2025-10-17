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
    public ListNode reverse(ListNode head){
        ListNode temp = null, curr = head;
        while (curr!=null){
            ListNode dummy = curr.next;
            curr.next = temp; 
            temp = curr;
            curr = dummy;
        }
        return temp;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;

        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;

        while (l1!=null || l2!=null || carry!=0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;

            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        return reverse(result.next);
    }
}

// Input: l1 = [7,2,4,3], l2 = [5,6,4]
// Output: [7,8,0,7]
