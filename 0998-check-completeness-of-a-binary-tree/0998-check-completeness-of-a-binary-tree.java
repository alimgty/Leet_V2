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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null){
            return true;
        }
        // TreeNode check=true;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
         
        boolean check=false;
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            if(n==null){
                check=true;
            }
            else{
                if(check){
                    return false;
                }
                q.offer(n.left);
                q.offer(n.right);
            }
        }
        return true;
        
    }
}