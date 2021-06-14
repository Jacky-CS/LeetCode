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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode s1 = l1, s2 = l2, curr = resultHead;
        int carry = 0;
        while(s1 != null || s2 != null){
            int x = 0, y = 0;
            if(s1 != null) x = s1.val;
            if(s2 != null) y = s2.val;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(s1 != null) s1 = s1.next;
            if(s2 != null) s2 = s2.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return resultHead.next;
    }
}
