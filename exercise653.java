import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.TreeMap;

public class exercise653 {
    public static boolean findTarget(TreeNode root, int k) {

        if (root == null || (root.left == null && root.right == null)) {
            return false;
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                TreeNode cur = q.poll();

                list.add(cur.val);

                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }

        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left != right) {
            if (arr[left] + arr[right] == k) {
                return true;
            }

            if (k - arr[left] - arr[right] > 0) {
                left++;
            } else {
                right--;
            }
        }

        return false;

    }
}
