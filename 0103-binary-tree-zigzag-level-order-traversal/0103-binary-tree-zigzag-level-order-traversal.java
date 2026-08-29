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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> him = new ArrayList<>();

        if (root == null) {
            return him;
        }

        Queue<TreeNode> h = new LinkedList<TreeNode>();
        Stack<TreeNode> s = new Stack<>();

        h.add(root);

        int d = 0;

        while (!h.isEmpty()) {

            int l = h.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < l; i++) {

                TreeNode himanshu = h.remove();

                if (d % 2 != 0) {
                    s.push(himanshu);
                } else {
                    list.add(himanshu.val);
                }

                if (himanshu.left != null) {
                    h.add(himanshu.left);
                }

                if (himanshu.right != null) {
                    h.add(himanshu.right);
                }
            }

            if (d % 2 != 0) {
                while (!s.isEmpty()) {
                    list.add(s.pop().val);
                }
            }

            him.add(list);
            d++;
        }

        return him;
    }
}