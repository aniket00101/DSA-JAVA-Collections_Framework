import java.util.*;

public class LevelOrderTraversal {
    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
        }
    }

    static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            if(temp.left != null)   q.add(temp.left);
            if(temp.right != null)  q.add(temp.right);
            System.out.print(temp.data + " ");
            q.remove();
        }
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
        levelorder(root);
    }
}
