/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        Queue<Node> queue = new LinkedList<>();
        //add the root node to the queue
        queue.add(root);
        // process the nodes form queue untill it is empty
                
        while(!queue.isEmpty()){
            int size = queue.size(); // size = 1;
            //traverse all ndoes at this level
            
            for(int i = 0; i < size; i++){
                
                Node curr = queue.poll();// node 1 is removed
                if(i == size - 1){
                    res.add(curr.data); // 1 is added to the result
                }
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            
        }
        return res;
        
    }
}