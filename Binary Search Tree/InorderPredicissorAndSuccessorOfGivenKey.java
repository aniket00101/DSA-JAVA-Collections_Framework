public class InorderPredicissorAndSuccessorOfGivenKey {
    static int suc, pred;
    static boolean flag;

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node temp = null; 

    static void inorder(Node root, int val){
        if(root == null)    return;
        inorder(root.left, val);
        if(temp == null)    temp = root;
        else {
            if(root.val == val){
                pred = temp.val;
                flag = true;
            } else if (root.val > val && flag == true){
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
