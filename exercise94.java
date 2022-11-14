import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class exercise94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        return btpt(root, new ArrayList<Integer>());
    }

    public List<Integer> btpt(TreeNode root, List<Integer> list) {

        if (root == null) {
            return list;
        }

        list = btit(root.left, list);

        list = btit(root.right, list);

        list.add(root.val);

        return list;

    }

}
