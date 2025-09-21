public class Solution700 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {

            this.val = val;

            this.left = left;

            this.right = right;

        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val==val) return root;
        while (true){
            if(root.val>val){
                if(root.left!=null) {
                    if (root.left.val == val) return root.left;
                    else root = root.left;
                }
                else return root.left;
            }
            else{
                if(root.right!=null) {
                    if(root.right.val==val) return root.right;
                else root = root.right;
                }
                else return root.right;
            }
        }
    }
}
