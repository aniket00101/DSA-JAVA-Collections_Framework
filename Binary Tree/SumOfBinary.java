package BinaryTree;
public class SumOfBinary {
    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
        }
    }

    static int sumofTree(Node root){
        if(root == null)    return 0;
        int leftsum = sumofTree(root.left);
        int rightsum = sumofTree(root.right);
        return leftsum + rightsum + root.data;
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
        System.out.println("Size is :" + sumofTree(root));
    }
}
