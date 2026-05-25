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
    public void level(TreeNode root,List<List<Integer>> l){
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> p = new ArrayList<>();
            for(int i = 1 ; i<= size;i++){
                TreeNode n1 =q.poll();
                p.add(n1.val);
                if(n1.left != null) q.offer(n1.left);
                if(n1.right != null) q.offer(n1.right);
            }
            l.add(p);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null) return l;
        level(root, l);
        return l;
        
    }   
}