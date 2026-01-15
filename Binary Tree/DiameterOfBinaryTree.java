// Leetcode 543
 
public class DiameterOfBinaryTree {

    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
        }
    }

    static int maximum = 0;

    static int diameterOfBinaryTree(Node root) {
        height(root);
        return maximum;
    }

    static int height(Node root){
        if(root == null)    return 0;
        int left = height(root.left);
        int right = height(root.right);
        maximum = Math.max(maximum, left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a; root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c; a.right = d;
        Node e = new Node(11);
        b.right = e;
        System.out.println("Height of Tree is :" + diameterOfBinaryTree(root));
    }
}
