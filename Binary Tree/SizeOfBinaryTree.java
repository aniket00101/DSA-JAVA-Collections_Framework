package BinaryTree;
public class SizeOfBinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
        }
    }

    static void preorder(Node root){
        if(root == null)    return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static int size (Node root){
        if(root == null)    return 0;
        int left = size(root.left);
        int right = size(root.right);
        return left + right + 1;
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
        System.out.println("Size is :" + size(root));
    }
}
