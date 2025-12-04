import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
class Solution103 {
    class Pair{
        TreeNode node;
        int level;

        public Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<Pair> que1 = new LinkedList<>();

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int currentLevel = 0;
        que1.add(new Pair(root,0));
        if(root == null) return ans;
        while (!que1.isEmpty()){
            Pair front = que1.remove();
            TreeNode n1 = front.node;
            int level = front.level;
            if(currentLevel!=level){
                currentLevel++;
                if(currentLevel%2==0) {
                    var reversed = temp.reversed();
                    ans.add(reversed);
                }
                else {
                    ans.add(temp);
                }
                temp = new ArrayList<>();

            }
            temp.add(n1.val);
            if(n1.left!=null){
                que1.add(new Pair(n1.left,level+1));
            }
            if(n1.right!=null){
                que1.add(new Pair(n1.right,level+1));
            }
        }
        if(!temp.isEmpty() && (currentLevel-1)%2==0) {
            var reversed = temp.reversed();
            ans.add(reversed);
        }
        else {
            ans.add(temp);
        }        return ans;
    }
}