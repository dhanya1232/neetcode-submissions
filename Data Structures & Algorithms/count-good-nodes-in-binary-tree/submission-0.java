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
    public int goodNodes(TreeNode root) {
        return binary(root,root.val);
    }
    private int binary(TreeNode node,int maxvalue){
        int count=0;
        if(node==null)
        return 0;
        if(node.val>=maxvalue){
            count++;
        }
        maxvalue=Math.max(maxvalue,node.val);
        count+=binary(node.left,maxvalue);
        count+=binary(node.right,maxvalue);
        return count;
    }
}
