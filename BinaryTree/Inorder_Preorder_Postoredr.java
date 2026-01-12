package BinaryTree;
public class Inorder_Preorder_Postoredr {
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

    static void inorder(Node root){
        if(root == null)    return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root){
        if(root == null)    return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
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

        System.out.print("preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(root);
        
    }
}
