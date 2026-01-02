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
    Map<TreeNode, TreeNode> him;

   void parent(TreeNode root) {
    if (root == null) return;

    if (root.left != null) {
        him.put(root.left, root);
        parent(root.left);
    }
    if (root.right != null) {
        him.put(root.right, root);
        parent(root.right);
    }
}

    TreeNode find(int val, TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode l = find(val, root.left);
        TreeNode r = find(val, root.right);
        if (l != null) {
            return l;
        }
        return r;
    }

    public int amountOfTime(TreeNode root, int start) {
        him = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> vis = new HashSet<>();
        parent(root);
        TreeNode st = find(start, root);
        q.add(st);
        int ans = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 1; i <= n; i++) {
                TreeNode p = q.poll();
                vis.add(p);
                if (p.left != null && !vis.contains(p.left)) {
                    q.add(p.left);
                }
                if (p.right != null&& !vis.contains(p.right)) {
                    q.add(p.right);
                }
                TreeNode par = him.get(p);
                if (par != null && !vis.contains(par)) {
                   
                    q.add(par);
                    
                }
            }
            ans++;
        }
        return ans - 1;

    }
}