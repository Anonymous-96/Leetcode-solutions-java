//Problem = Copy List Random Pointer (LC-138)
//Link = https://leetcode.com/problems/copy-list-with-random-pointer/

class CopyListRandomPointer_Leetcode_138 {
    public Node deepCopy(Node head){
        Node newHead = new Node(head.val);
        Node t1 = head.next;
        Node t2 = newHead;
        while(t1!=null){
            Node temp = new Node(t1.val);
            t2.next=temp;
            t2=t2.next;
            t1=t1.next;
        }
        return newHead;
    }
    public void alternateConnections(Node head, Node head2){
        Node temp = new Node(-1);
        Node t1 =head;
        Node t2 = head2;
        Node t = temp;
        while(t1!=null && t2!=null){
            t.next=t1;
            t1=t1.next;
            t=t.next;
            t.next=t2;
            t2=t2.next;
            t=t.next;
        }
    }
    public void assignRandomPointer(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        while(t1!=null){
            t2=t1.next;
            if(t1.random!=null) t2.random=t1.random.next;
            t1=t1.next.next;

        }
    }
    public void split(Node head, Node head2){
        Node t1=head;
        Node t2 =head2;
        while(t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if(t1==null) break;
            t2.next=t1.next;
            t2=t2.next;
        }
    }
    public Node copyRandomList(Node head) {
        // Step -1 create a deep copy
        if(head==null) return null;
        Node head2 = deepCopy(head);
        //Step -2 altenateConnections
        alternateConnections(head,head2);
        //Step-3 Assign Random Pointers
        assignRandomPointer(head, head2);
        //Step-4 Split the LinkeList Now
        split(head, head2);
        return head2;

    }
}