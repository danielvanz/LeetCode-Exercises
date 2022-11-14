import java.util.HashSet;

public class exercise1457 {

    public int pseudoPalindromicPaths(TreeNode root) {

        HashSet<Integer> set = new HashSet<>();
        return findPalindromicPaths(root, set);
    }

    int findPalindromicPaths(TreeNode root, HashSet<Integer> hashSet) {

        if (root == null) {
            return 0;
        }
        if (hashSet.contains(root.val)) {
            hashSet.remove(root.val);
        } else {
            hashSet.add(root.val);
        }

        System.out.println(hashSet);

        if (root.left == null && root.right == null) {
            return hashSet.size() <= 1 ? 1 : 0;
        }

        int left = findPalindromicPaths(root.left, new HashSet<>(hashSet));
        int right = findPalindromicPaths(root.right, new HashSet<>(hashSet));

        return left + right;
    }
}
