// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class LongestConsecutivePath {
    int maxLength = 0;

    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val, 0);
        return maxLength;
    }

    private void dfs(TreeNode node, int expected, int currentLength) {
        if (node == null) return;

        if (node.val == expected) {
            currentLength++;
        } else {
            currentLength = 1;
        }

        maxLength = Math.max(maxLength, currentLength);

        dfs(node.left, node.val + 1, currentLength);
        dfs(node.right, node.val + 1, currentLength);
    }

    // Sample usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(4);

        LongestConsecutivePath obj = new LongestConsecutivePath();
        System.out.println("Longest Consecutive Path Length: " + obj.longestConsecutive(root));
    }
}
