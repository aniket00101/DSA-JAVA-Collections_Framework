class Solution {
    private TreeNode helper(TreeNode root, int val){
        if(root == null)    return new TreeNode(val);
        else if(val < root.val)     root.left = helper(root.left, val);
        else   root.right = helper(root.right, val);
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            root = helper(root, preorder[i]);
        }
        return root;
    }
}