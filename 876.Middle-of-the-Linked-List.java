// Logic of 2 pointers

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){      // both fast & fast.next should be null
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;        //slow is the midlle node
    }
}
