/// EASY ////
//// to find if a tree is balanced correctly

public class Question110 {
    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);
        input.left.left = new TreeNode(4);
        input.left.right = new TreeNode(5);
        input.left.left.right = new TreeNode(8);
        input.left.left.left = new TreeNode(9);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(7);
        // input.left.left.left.right = new TreeNode(8);

        System.out.println(isBalanced(input));
    }

    static boolean isBalanced(TreeNode root) {

        return (findDepth(root) != null);

    }

    static Integer findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Integer leftDepth = findDepth(root.left);
        Integer rightDepth = findDepth(root.right);

        if (leftDepth == null || rightDepth == null) {
            return null;
        }

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return null;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
