public class exercise606 {
    public String tree2str(TreeNode root) {

        if (root == null) {
            return "";
        }

        StringBuilder finalResult = makeTreeString(new StringBuilder(), root);
        return finalResult.toString();
    }

    private StringBuilder makeTreeString(StringBuilder result, TreeNode node) {

        if (node.left == null && node.right == null) {
            return result.append(node.val);
        } else if (node.left == null) {
            return result.append(node.val + "()(" + makeTreeString(new StringBuilder(), node.right) + ")");
        } else if (node.right == null) {
            return result.append(node.val + "(" + makeTreeString(new StringBuilder(), node.left) + ")");
        } else {
            return result
                    .append(node.val + "(" + makeTreeString(new StringBuilder(), node.left) + ")("
                            + makeTreeString(new StringBuilder(), node.right) + ")");
        }
    }
}
