////// EASY /////
///////// Minimun depth of a tree

public class Question111 {
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
        input.left.left.left.right = new TreeNode(8);
        System.out.println(minDepth(input));
    }

    static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right != null)
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        else
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
