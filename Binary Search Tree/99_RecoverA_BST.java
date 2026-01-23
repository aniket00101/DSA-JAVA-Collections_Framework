class Solution {
    int idx = 0;

    private void inorder(TreeNode root, List<Integer> res){
        if(root == null)    return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    private void inorder2(TreeNode root, List<Integer> res){
        if(root == null)    return;
        inorder2(root.left, res);
        root.val = res.get(idx++);
        inorder2(root.right, res);
    }

    public void recoverTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        Collections.sort(res);
        inorder2(root, res);
    }
}