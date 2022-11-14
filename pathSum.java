public class pathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return pathSumResult(root, targetSum, 0);
    }

    private boolean pathSumResult(TreeNode root, int targetSum, int i) {

        if (root == null) {
            return false;
        }

        int sum = i + root.val;

        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        return pathSumResult(root.left, targetSum, sum) || pathSumResult(root.right, targetSum, sum);
    }
}
