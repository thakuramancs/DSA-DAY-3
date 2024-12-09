import java.lang.classfile.components.ClassPrinter.ListNode;

public class IsPalindromeLL {
    public boolean isPalindrome(ListNode head) {
     if(head==null || head.next==null)
     {
        return true;
     }  
     ListNode curr=head;
     ListNode slow=head;
     ListNode fast=head;
     while(fast!=null && fast.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     } 
     ListNode prev=null;
     curr=slow;
    
     while(curr!=null)
     {
        ListNode nxt=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nxt;
     }
     while(prev!=null && head!=null)
     {
       if(head.val==prev.val)
          {
            prev=prev.next;
            head=head.next;
          }
          else
            return false;
     }
    return true;    
    }
}
