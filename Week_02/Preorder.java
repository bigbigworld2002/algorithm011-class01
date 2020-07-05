/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list=new ArrayList();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return new ArrayList();
        }

        if(root.children==null){
            return new ArrayList();
        }

        list.add(root.val);

        for(Node node:root.children){
            preorder(node);
        }

        return list;
    }
}