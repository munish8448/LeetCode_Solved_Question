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
    public void reorderList(ListNode head) {
    
        // get mid and break
        ListNode mid = getMiddleOfLinkedList(head);
        ListNode p2 = mid.next;
        mid.next = null;

        // reverse 2nd part
        ListNode head2 = reverse(p2);

        // reorder
        ListNode dummyNode = new ListNode(0);
        ListNode tmp = dummyNode;

        while(head != null && head2 != null){
            tmp.next = head;
            tmp = tmp.next;
            head = head.next;

            tmp.next = head2;
            tmp = tmp.next;
            head2 = head2.next;

        }

        if(head != null){
            tmp.next = head;
        }

    
    }

    public static ListNode reverse(ListNode head){
        // three pointer reverse method for linked list

        ListNode curr = head, prev = null;
        while(curr != null){
            // save the next node address in nbr pointer
            ListNode nbr = curr.next;
            // connect the current node with previous node
            curr.next = prev;
            // move previous pointer forward
            prev = curr;
            // move current pointer forward
            curr = nbr;
        }

        return prev;
    }
    
    public static ListNode getMiddleOfLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
