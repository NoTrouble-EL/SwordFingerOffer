package SwordFingerOffer27;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/28 15:11
 */
public class MirrorTree {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode mirrorTree(TreeNode root){
        // corner case
        if (root == null){
            return root;
        }

        //翻转左子树
        TreeNode left = mirrorTree(root.left);
        //翻转右子树
        TreeNode right = mirrorTree(root.right);

        //将翻转的左子树接在根节点的右子树
        root.right = left;
        //将翻转的右子树接在根节点的左子树
        root.left = right;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        TreeNode res = mirrorTree(root);
        System.out.println(res);
    }
}
