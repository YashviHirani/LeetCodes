public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return inorder(root.left,root.right);
    }
    boolean inorder(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        return inorder(root1.left,root2.right) && inorder(root1.right,root2.left);
    }
}
