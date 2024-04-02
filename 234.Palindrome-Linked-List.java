class Solution {
    public boolean isPalindrome(ListNode head) {
        //Corner Case
        if(head == null || head.next == null){
            return true;
        }

        //Step 1: Find mid node
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        ListNode mid = slow;

        //Step 2: Reverse right half of LL
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;  

        //Step 3: Compare right and left halves
        while(left != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
