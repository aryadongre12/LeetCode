class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;               // calculate size of LL
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){             // if size = n, remove head
            return head.next;
        }

        ListNode prev = new ListNode();
        prev.next = head;          // initialize prev.next = head;
        int i = 0;                  
        int idx = size - n;
        while(i < idx){            // travel from 0 to size-n and just do prev.next = prev.next.next
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}
