/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        
        if(head == null || head.next == null) return head;
        
        Node first = head;
        Node sec = head.next;
        
        first.next = pairwiseSwap(sec.next);
        
        sec.next = first;
        
        return sec;
        
    }
}