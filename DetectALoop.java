public class DetectALoop {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null)
          return false;
        while(fast!=null && fast.next!=null)
        {     
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                 break;
        if(fast==null || fast.next==null)
            {
               return false;
            }
            
        }

        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
           return true;
    }
}