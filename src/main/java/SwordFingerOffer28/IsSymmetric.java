package SwordFingerOffer28;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/28 15:20
 */
public class IsSymmetric {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean isSymmetric(TreeNode root){
        //corner case
        if (root == null){
            return true;
        }

        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode A, TreeNode B){
        //边界条件和递归出口
        if (A == null && B == null){
            return true;
        }
        if (A == null || B == null){
            return false;
        }

        //根结点相同 且 A的左子树与B的右子树相同 且 A的右子树和B的左子树相同
        return A.val == B.val && helper(A.left, B.right) && helper(A.right, B.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println(isSymmetric(root));
    }
}
