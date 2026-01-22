class Solution {
    private TreeNode helper(int[] arr, int low, int high){
        if(low > high)    return null;
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr, low, mid - 1);
        root.right = helper(arr, mid + 1, high);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        int arr[] = new int[n];
        temp = head;
        int i = 0;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        return helper(arr, 0, n - 1);
    }
}