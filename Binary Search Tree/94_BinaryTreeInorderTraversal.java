class Solution {
    private List<Integer> inorder(TreeNode root, List<Integer> res){
        if(root==null)  return new ArrayList<>();
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
        return res;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
}