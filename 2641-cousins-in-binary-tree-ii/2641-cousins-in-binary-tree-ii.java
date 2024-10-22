/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> him = new LinkedList<>();
        him.add(root);



        root.val = 0;
        Queue<TreeNode> temp = new LinkedList<>();
        while (!him.isEmpty()) {
            int sum = 0;

            int l = him.size();
           // System.out.println(l);
            for (int i = 1; i <= l; i++) {
                TreeNode p = him.poll();
                temp.add(p);

                if (p.left != null) {

                    sum += p.left.val;
                   // System.out.print(sum + " ");
                    him.add(p.left);
                }
                if (p.right != null) {

                    sum += p.right.val;
                  //  System.out.print(sum);
                    him.add(p.right);
                }
            }
          //  System.out.println();

            for (int i = 1; i <= l; i++) {
                int c = 0;
                TreeNode p = temp.poll();
                if (p.left != null) {
                    c += p.left.val;
                }
                if (p.right != null) {
                    c += p.right.val;
                }
                if (p.left != null) {
                    p.left.val = sum - c;
                }
                if (p.right != null) {
                    p.right.val = sum - c;
                }
            }
        }
        return root;

    }
}