public class exercise1448 {
    public int goodNodes(TreeNode root) {

        return goodNodesInPath(root, Integer.MIN_VALUE);
    }

    private int goodNodesInPath(TreeNode node, int max) {

        int goodNode = 0;

        if (node == null) {
            return 0;
        }

        if (node.val >= max) {
            max = node.val;
            goodNode = 1;
        }

        if (node.left == null && node.right == null) {
            return goodNode;
        }

        return goodNodesInPath(node.left, max) + goodNodesInPath(node.right, max) + goodNode;

    }
}
