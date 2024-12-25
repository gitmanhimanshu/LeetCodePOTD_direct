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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> him=new ArrayList<>();
        if(root==null){
            return him;
        }
        
        Queue<TreeNode> him1=new LinkedList<>();
        him1.add(root);
        while(!him1.isEmpty()){
            int l=him1.size();
         
            int max=Integer.MIN_VALUE;
            for(int i=0;i<l;i++){
                   TreeNode h=him1.remove();
                if(h.val>max){
                    max=h.val;
                }
                if(h.left!=null){
                    him1.add(h.left);
                }
                if(h.right!=null){
                    him1.add(h.right);
                }
            }
            him.add(max);
        }
return him;
    }
}