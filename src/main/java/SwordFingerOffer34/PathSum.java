package SwordFingerOffer34;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/28 15:56
 */
public class PathSum {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static List<List<Integer>> pathSum(TreeNode root, int target){
        //创建一个list用于保存结果
        List<List<Integer>> res = new ArrayList<>();
        //corner case
        if (root == null){
            return res;
        }

        //backtracking
        helper(root, target, new ArrayList<>(), res);

        return res;
    }

    private static void helper(TreeNode root, int target, List<Integer> list, List<List<Integer>> res){
        //corner case
        if (root == null){
            return;
        }
        //加入头结点
        list.add(root.val);
        //跟新target
        target = target - root.val;
        //满足target == 0 且 为叶子结点则加入res
        if (target == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
        }
        //查找
        helper(root.left, target, list, res);
        helper(root.right, target, list, res);
        //回溯
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(5);
        TreeNode node9 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node3.left = node6;
        node3.right = node7;
        node2.left = node4;
        node2.right = node5;
        node5.left = node8;
        node5.right = node9;

        List<List<Integer>> res = pathSum(root, 22);
        System.out.println(res);
    }
}
