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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        depth(root);
        return diameter;
    }
    public int depth(TreeNode node){
        if(node==null)
        return 0;
        int L=depth(node.left);
        int R=depth(node.right);
        diameter=Math.max(diameter,L+R);
        return 1+Math.max(L,R);
    }
}