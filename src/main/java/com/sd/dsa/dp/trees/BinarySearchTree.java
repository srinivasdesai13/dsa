package com.sd.dsa.dp.trees;

public class BinarySearchTree {

	/*
	 * A binary search tree has the property that for each node, all elements in its
	 * left subtree are less than the node's value, and all elements in its right
	 * subtree are greater than the node's value.
	 * 
	 * 
	 * 
	 * Question:
	 * 
	 * You are given the root of a binary tree. Write a Java method to check if the
	 * tree is a binary search tree (BST).
	 * 
	 * 
	 */
	public static void main(String[] args) {

		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);

		boolean result = isBST(root);
		System.out.println("Is the tree a BST? " + result);

	}

	private static boolean isBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;

		if (leftNode != null && leftNode.val > root.val) {
			return false;
		}

		if (rightNode != null && rightNode.val < root.val) {
			return false;
		}

		if (!isBST(leftNode) || !isBST(rightNode)) {
			return false;
		}

		return true;
	}

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}