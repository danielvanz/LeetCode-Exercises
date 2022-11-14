import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class exercise637 {
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Double> list = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            double sumLevel = 0;

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                sumLevel += node.val;

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            list.add(sumLevel / level);

        }

        return list;
    }
}
