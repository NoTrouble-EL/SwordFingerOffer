package SwordFingerOffer26;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/28 14:57
 */
public class IsSubStructure {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B){
        //边界条件和corner case
        if (A == null || B == null){
            return false;
        }

        //若A和B的结构完全相同 或 A的左子树中存在B的结构完全相同 或A的右子树中存在和B的结构完全相同
        return helper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    //判断A和B的结构是否完全相同
    private static boolean helper(TreeNode A, TreeNode B){
        //边界条件和递归出口
        //若B为null则直接返回true
        if (B == null){
            return true;
        }
        if (A == null){
            return false;
        }

        // 根节点的值相同 且 A的左子和B的左子相同 且 A的左子和B的左子相同
        return A.val == B.val && helper(A.left, B.left) && helper(A.right, B.right);
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        A.left = node1;
        A.right = node2;
        node1.left = node3;
        node1.right = node4;

        TreeNode B = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);
        B.left = node5;

        System.out.println(isSubStructure(A, B));
    }
}
