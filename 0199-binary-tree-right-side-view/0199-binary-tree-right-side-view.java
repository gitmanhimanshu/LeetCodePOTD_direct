/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
          return  new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> him=new LinkedList<>();
        him.add(root);
        while(!him.isEmpty()){
            int n=him.size();
            int last=-1;
            while(n>0){
            TreeNode p=him.poll();
            last=p.val;
            if(p.left!=null){
                him.add(p.left);
            }
            if(p.right!=null){
                him.add(p.right);
            }
            n--;
            }

      ans.add(last);
        }
        return ans;
    }
}