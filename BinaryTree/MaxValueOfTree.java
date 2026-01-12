package BinaryTree;
public class MaxValueOfTree {
    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
        }
    }

    static int maxvalue(Node root){
        if(root == null)    return Integer.MIN_VALUE;
        int a = root.data;
        int b = maxvalue(root.left);
        int c = maxvalue(root.right);
        return Math.max(a, Math.max(b, c));
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
        System.out.println("Maximum value is :" + maxvalue(root));
    }
}
