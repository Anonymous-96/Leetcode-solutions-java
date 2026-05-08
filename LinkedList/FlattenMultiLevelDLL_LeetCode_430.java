
/* Leetcode 430  Flatten a Multilevel Doubly Linked List
    Solved by Recursive Approach
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
public class FlattenMultiLevelDLL_LeetCode_430 {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
            Node n = temp.next;
            if(temp.child!=null){
                Node c = flatten(temp.child); //recursion
                Node d =c;
                while(d.next!=null) d=d.next;
                temp.next=c; c.prev=temp;
                d.next=n;
                if(n!=null) n.prev=d;
                temp.child=null; //make all nodes child node empty
            }
            temp=n;
        }
        return head;
    }
}