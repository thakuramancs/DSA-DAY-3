import java.lang.classfile.components.ClassPrinter.ListNode;

public class RemoveNthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode curr=head;
     int l=0;
     ListNode prev=null;
     if(head==null)
        return null;
     while(curr.next!=null)
     {
        l++;
        prev=curr;
        curr=curr.next;
     }
     l=l+1;
     if(l==1 && n==1)
        return null;
    if (l==2 && n==1)
       {head.next=null;
       return head;}
     if(n==1)
     {
        prev.next=null;
        return head;
     }
     l=l-n;
     curr=head;
     prev=null;

     while(curr!=null)
     {
        if(l==0)
        {
          curr.val=curr.next.val;
          curr.next=curr.next.next;
        }
        curr=curr.next;
        l--;
     }
     return head;
    }
}
