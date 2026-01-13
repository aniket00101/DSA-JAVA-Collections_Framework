class Solution {
    private boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null)  return true;
        if(p == null || q == null)  return false;
        if((p.val == q.val) && check(p.left, q.right) && check(p.right, q.left))    return true;
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)    return true;
        return check(root.left, root.right);
    }
}