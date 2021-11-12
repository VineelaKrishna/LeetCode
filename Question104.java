//// EASY /////
///// Find depth of a tree ////////

public class Question104 {
    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);
        input.left.left = new TreeNode(4);
        input.left.right = new TreeNode(5);
        // input.left.left.right = new TreeNode(8);
        // input.left.left.left = new TreeNode(9);
        // input.right.left = new TreeNode(6);
        // input.right.right = new TreeNode(7);
        // input.left.left.left.right = new TreeNode(8);
        System.out.println(maxDepth(input));
    }

    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Integer leftDepth = maxDepth(root.left);
        Integer rightDepth = maxDepth(root.right);

        return Math.min(leftDepth, rightDepth) + 1;

    }

}
