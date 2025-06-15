#226. Invert Binary Tree
🔗 Problem Link(https://leetcode.com/problems/invert-binary-tree/)
📁 Topic: Binary Tree, Recursion

🔄 Recursively swap left and right child nodes.

🔁 Invert left and right subtrees.

🛑 Base case: if node is null, return.

Time Complexity: O(n)
Space Complexity: O(h) (recursive stack)

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

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invert(root);
        return root;
    }

    public void invert(TreeNode node) {
        if (node == null) return;
    
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
    }
}