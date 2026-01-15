import java.util.*;

class BalancedBinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
        }
    }

    static int height(Node root){
        if(root == null )    return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }
    static boolean isBalanced(Node root) {
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        int d = left - right;
        if(d > 1 || d < -1)     return false;
        return isBalanced(root.left) && isBalanced(root.right);
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
        System.out.println("Height of Tree is : " + isBalanced(root));
    }
}
