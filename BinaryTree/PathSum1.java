class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)    return false;
        if(root != null && root.left == null && root.right == null){
            if(root.val == targetSum)   return true;
            return false;
        }
        int n = targetSum - root.val;
        return hasPathSum(root.left, n) || hasPathSum(root.right, n);
    }
}