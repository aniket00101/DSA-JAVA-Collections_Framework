class Solution {
    private int height(TreeNode root){
        if(root == null)    return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }

    private void nthlevel1(TreeNode root, int n, List<Integer> arr){
        if(root == null)    return;
        if(n == 1){
            arr.add(root.val);
            return;
        }
        nthlevel1(root.left, n - 1, arr);
        nthlevel1(root.right, n - 1, arr);
    }

    private void nthlevel2(TreeNode root, int n, List<Integer> arr){
        if(root == null)    return;
        if(n == 1){
            arr.add(root.val);
            return;
        }
        nthlevel2(root.right, n - 1, arr);
        nthlevel2(root.left, n - 1, arr);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root);
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)    return res;
        for(int i=1; i<=level; i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2!=0)  nthlevel1(root, i, arr);
            else    nthlevel2(root, i, arr);
            res.add(arr);
        }
        return res;
    }
}