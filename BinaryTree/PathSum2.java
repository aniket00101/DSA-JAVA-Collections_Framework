class Solution {
    private void helper(List<List<Integer>> ans  ,List<Integer> res, TreeNode root, int targetSum) {
        if(root == null)    return;
        res.add(root.val);
        if(root.left == null && root.right == null && targetSum == root.val){
            ans.add(new ArrayList<>(res));
        } else {
            int remain = targetSum - root.val;
            helper(ans, res, root.left, remain);
            helper(ans, res, root.right, remain);
        }
        res.remove(res.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(ans, res, root, targetSum);
        return ans;
    }
}