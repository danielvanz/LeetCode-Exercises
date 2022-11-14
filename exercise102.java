import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class exercise102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();

        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            int qLength = q.size();

            ArrayList<Integer> entry = new ArrayList<>();
            for (int i = 0; i < qLength; i++) {
                TreeNode node = q.poll();
                entry.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }

            }
            list.add(entry);

        }

        return list;

    }

    public static void main(String[] args) {

    }
}
