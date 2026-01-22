class Solution {
    private void helper(TreeNode root, List<Integer> res){
        if(root == null)    return;
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        helper(root1, res);
        helper(root2, res);
        Collections.sort(res);
        return res;
    }
}