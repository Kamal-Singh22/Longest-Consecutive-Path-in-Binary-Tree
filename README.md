# Longest-Consecutive-Path-in-Binary-Tree
Given a binary tree, find the length of the longest consecutive path where each value is one more than its parent.
Explanation:
TreeNode Class: Represents a node in the binary tree.

DFS Traversal:

The dfs method checks whether the current node is part of a consecutive sequence.

If the current node value matches the expected value (parent.val + 1), we increase the sequence length.

Otherwise, reset the length to 1.

maxLength keeps track of the longest path found during traversal....
