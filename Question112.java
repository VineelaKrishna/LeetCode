//// EASY ////
//// has Path for the target sum mentioned

public class Question112 {
    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);
        input.left.left = new TreeNode(4);
        input.left.right = new TreeNode(5);

        input.left.left.left = new TreeNode(6);
        input.left.left.right = new TreeNode(7);
        input.left.left.left.right = new TreeNode(8);

        input.right.left = new TreeNode(9);
        input.right.right = new TreeNode(10);

        System.out.println(hasPathSum(input, 15));
    }

    static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return (hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum));

    }
}
