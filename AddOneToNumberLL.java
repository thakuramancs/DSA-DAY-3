public class   {
    public Node addOne(Node head) {
        if (head == null) {
            return new Node(1);
        }
        
        int carry = helper(head);
        
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        
        return head;
    }

    private int helper(Node head) {
        if (head == null) {
            return 1;
        }

        int carry = helper(head.next);

        if (carry == 1) {
            if (head.data == 9) {
                head.data = 0;
                return 1;
            } else {
                head.data++;
                return 0;
            }
        }
        
        return 0;
    }
}
