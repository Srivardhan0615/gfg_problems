/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return height_check(root) != -1;
    }
    private int height_check(Node root){
        
        if(root == null) return 0;
        
        int leftH = height_check(root.left);
        
        if(leftH == -1) return -1;
        
        int rightH = height_check(root.right);
        
        if(rightH == -1) return -1;
        
        if(Math.abs(leftH - rightH) > 1) return -1;
        
        return 1 + Math.max(leftH, rightH);
        
        
    }
}