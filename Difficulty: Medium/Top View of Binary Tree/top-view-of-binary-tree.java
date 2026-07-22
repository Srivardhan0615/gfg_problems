/*
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
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        // tree map is an ordered map
        TreeMap<Integer, Integer> map =new TreeMap<>();
        
        Queue<NodewithHD> q = new LinkedList<>();
        //rootnode with HD value
        q.offer(new NodewithHD(root,0)); // q = [(10,0)]
        
        while(!q.isEmpty()){
            
            NodewithHD curr = q.poll(); // (10,0)
            Node node =  curr.node; // 10
            int hd = curr.hd; // 0
            
            if(!map.containsKey(hd)){
                map.put(hd, node.data); // 0:[10]
            }
            if(node.left != null){
                q.offer(new NodewithHD(node.left, hd-1));
            }
            if(node.right != null){
                q.offer(new NodewithHD(node.right, hd+1));
            }
        }
        for(int val : map.values()){
            
            res.add(val);
        }
        return res;
        
    }
}
class NodewithHD{
    Node node;
    int hd;
    NodewithHD(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}