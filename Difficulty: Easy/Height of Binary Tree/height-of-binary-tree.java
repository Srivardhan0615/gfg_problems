/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root == null) return -1;
        
        int leftH = height(root.left);
        int rightH = height(root.right);
        
        return Math.max(leftH, rightH) + 1;
    }
}