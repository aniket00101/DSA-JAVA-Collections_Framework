// using arraylist space complexity O(n)
// import java.util.*;
// public class InorderPredicissorAndSuccessorOfGivenKey {
//     static int suc, pred;
//     static boolean flag;
//     static class Node {
//         int val;
//         Node left, right;
//         Node(int val) {
//             this.val = val;
//         }
//     }
//     static void inorder(Node root, ArrayList<Integer> arr){
//         if(root == null)    return;
//         inorder(root.left, arr);
//         arr.add(root.val);
//         inorder(root.right, arr);
//     }
//     public static void main(String[] args) {
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.right = new Node(70);
//         root.left.left = new Node(20);
//         root.left.right = new Node(40);
//         root.right.left = new Node(60);
//         root.right.right = new Node(80);
//         int key = 50;
//         ArrayList<Integer> arr = new ArrayList<>();
//         inorder(root, arr);
//         int idx = -1;
//         for(int i=0; i<arr.size(); i++){
//             if(arr.get(i)==key){
//                 idx = i;
//                 break;
//             }
//         }
//         int pred = arr.get(idx-1);
//         int suc = arr.get(idx+1);

//         System.out.println("Predecessor: " + pred);
//         System.out.println("Successor: " + suc);
//     }
// }



// without using arraylist Space Complexity(1)

public class InorderPredicissorAndSuccessorOfGivenKey {
    static int suc, pred;
    static boolean flag;
    static Node temp = null; 
    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }

    static void inorder(Node root, int val){
        if(root == null)    return;
        inorder(root.left, val);
        if(temp == null)    temp = root;
        else {
            if(root.val == val){
                pred = temp.val;
                flag = true;
            } else if(val > root.val && flag == true){
                suc = root.val;
                flag = false;
            } else {
                temp = root;
            }
        }
        inorder(root.right, val);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        int key = 50;
        inorder(root, key);
        System.out.println("Predecessor: " + ( pred ));
        System.out.println("Successor: " + (suc));
    }
}
