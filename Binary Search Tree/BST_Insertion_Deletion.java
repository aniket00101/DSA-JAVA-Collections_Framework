import java.util.Scanner;

public class BST_Insertion_Deletion {

    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }

    Node root;

    Node insert (Node root, int val){
        if(root == null)    return new Node(val);
        if(val < root.val)     root.left = insert(root.left, val);
        else    root.right = insert(root.right, val);
        return root;
    }
    
    void inorder(Node root){
        if(root == null)    return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    int getSmall(Node root){
        if(root.left==null)     return root.val;
        else return getSmall(root.left);
    }

    Node delete(Node root, int key){
        if(root==null) return null;
        if(key<root.val) root.left = delete(root.left,key);
        else if(key>root.val) root.right = delete(root.right,key);
        else{
            if(root.left==null && root.right==null) return null;
            else if(root.left==null)return root.right;
            else if(root.right==null) return root.left;
            else{
                int small = getSmall(root.right);
                root.val = small;
                root.right = delete(root.right, small);
            }
        }
        return root;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BST_Insertion_Deletion obj = new BST_Insertion_Deletion();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            obj.root = obj.insert(obj.root, val);
        }
        obj.inorder(obj.root);
    }
}
