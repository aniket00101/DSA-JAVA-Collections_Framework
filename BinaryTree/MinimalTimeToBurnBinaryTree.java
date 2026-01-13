import java.util.HashMap;

class Solution {
    private TreeNode getNode(TreeNode root, int start){
        if(root == null) return null;
        if(root.val == start) return root;
        TreeNode left = getNode(root.left);
        TreeNode right = getNode(root.right);
        if(left == null)    return right;
        else return left;
    }
    public void preorder(TreeNode root, HashMap<TreeNode, TreeNode> p) {
        if(root == null)    return;
        if(root.left != null)   p.put(root.left, root);
        if(root.right != null)  p.put(root.right, root);
        preorder(root.left, p);
        preorder(root.right, p);
    }
    public int amountOfTime(TreeNode root, int start) {
        TreeNode node = getNode(root, start);
        Map<TreeNode, TreeNode> p = new HashMap<>();
        preorder(root, p);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        Map<TreeNode, Integer> v = new HashMap<>();
        v.put(node, 0);
        while(q.size() > 0){
            TreeNode temp = q.peek();
            int level = v.get(temp)+1;
            if(temp.left != null && !v.containsKey(temp.left)){
                q.add(temp.left);
                v.put(temp.left, level+1);
            }
            if(temp.right != null && !v.containsKey(temp.right)){
                q.add(temp.right);
                v.put(temp.right, level+1);
            }
            if(p.containsKey(temp) && !v.containsKey(v.get(temp))){
                q.add(p.get(temp));
                v.put(p.get(temp),level+1);
            }
            q.remove();
        }
        int max = -1;
        for(int level : v.values()) max = Math.max(max, level);
        return max;
    }
}











class Solution {

    private TreeNode getNode(TreeNode root, int start){
        if(root == null) return null;
        if(root.val == start) return root;

        TreeNode left = getNode(root.left, start);
        if(left != null) return left;

        return getNode(root.right, start);
    }

    public void preorder(TreeNode root, Map<TreeNode, TreeNode> parent) {
        if(root == null) return;

        if(root.left != null) parent.put(root.left, root);
        if(root.right != null) parent.put(root.right, root);

        preorder(root.left, parent);
        preorder(root.right, parent);
    }

    public int amountOfTime(TreeNode root, int start) {

        TreeNode node = getNode(root, start);
        if(node == null) return 0;

        Map<TreeNode, TreeNode> parent = new HashMap<>();
        preorder(root, parent);

        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Integer> visited = new HashMap<>();

        q.add(node);
        visited.put(node, 0);

        int maxTime = 0;

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int time = visited.get(curr);

            maxTime = Math.max(maxTime, time);

            if(curr.left != null && !visited.containsKey(curr.left)){
                visited.put(curr.left, time + 1);
                q.add(curr.left);
            }

            if(curr.right != null && !visited.containsKey(curr.right)){
                visited.put(curr.right, time + 1);
                q.add(curr.right);
            }

            if(parent.containsKey(curr) && !visited.containsKey(parent.get(curr))){
                visited.put(parent.get(curr), time + 1);
                q.add(parent.get(curr));
            }
        }

        return maxTime;
    }
}
