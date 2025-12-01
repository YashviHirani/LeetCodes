class Solution701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode root1 = root;
        if(root1==null){
            root1 = new TreeNode(val);
        }
        else{
            while(true){
                if(val<root1.val){
                    if(root1.left==null){
                        root1.left = new TreeNode(val);
                        return root;
                    }
                    root1 = root1.left;
                }
                else{
                    if(root1.right==null){
                        root1.right = new TreeNode(val);
                        return root;
                    }
                    root1 = root1.right;
                }
            }
        }
        return null;
    }
}