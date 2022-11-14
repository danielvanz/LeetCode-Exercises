public class exercise623 {
    public static TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            TreeNode result = new TreeNode(val, root, null);
            return result;
        }

        findDepth(root, val, depth);

        return root;

    }

    public static void findDepth(TreeNode node, int val, int depth) {

        if (depth == 2) {

            TreeNode storeLeft = node.left;
            node.left = new TreeNode(val, storeLeft, null);
            TreeNode storeRight = node.right;
            node.right = new TreeNode(val, null, storeRight);

            return;
        }

        depth--;

        if (node.left != null) {
            findDepth(node.left, val, depth);
        }
        if (node.right != null) {
            findDepth(node.right, val, depth);
        }

    }
}
