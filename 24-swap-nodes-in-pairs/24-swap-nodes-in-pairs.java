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
        
        ListNode dummy=new ListNode(0);
		ListNode prev=dummy;
		dummy.next=head;
		while(prev.next!=null && prev.next.next!=null)
		{
			ListNode first = prev.next;
			ListNode second= prev.next.next;
			first.next=second.next;
			second.next=first;
			prev.next=second;
			prev=first;
		}
		return dummy.next;
        
    }
    
    /** Recursive method
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = second.next;
        
        second.next = head;
        head.next = swapPairs(third);
        
        return second;
    }**/
}