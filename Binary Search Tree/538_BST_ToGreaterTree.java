class Solution {
    static int sum = 0;
    private void inorder(TreeNode root){
        if(root == null)    return;
        inorder(root.right);
        root.val = root.val + sum;
        sum = root.val;
        inorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        inorder(root);
        return root;
    }
}