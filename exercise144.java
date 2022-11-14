import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class exercise144 {

    public static List<Integer> preorderTraversal(TreeNode root) {

        return btpr(root, list);
    }

    public static List<Integer> btpr(TreeNode node, ArrayList<Integer> list) {

        if (node == null) {
            return list;
        }
        list.add(node.value);

        list = btpr(node.left, list);

        return btpr(node.right, list);
    }

}