package SwordFingerOffer36;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/29 10:33
 */
public class TreeToDoublyList {

    private static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node treeToDoublyList(Node root){
        //corner case
        if (root == null){
            return root;
        }

        //创建一个栈用来中序遍历
        Deque<Node> stack = new ArrayDeque<>();
        //创建链表的头指针和尾指针
        Node head = null, tail = null;

        //中序遍历
        while (root != null || !stack.isEmpty()){
            if (root != null){
                //左
                stack.push(root);
                root = root.left;
            }else{
                //根
                Node cur = stack.pop();

                //处理链表
                if (head == null){
                    head = cur;
                    tail = cur;
                }else{
                    tail.right = cur;
                    cur.left = tail;
                    tail = cur;
                }

                //右
                root = cur.right;
            }
        }

        //循环链表
        head.left = tail;
        tail.right = head;

        return head;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        Node node1 = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(1);
        Node node4 = new Node(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        Node res = treeToDoublyList(root);
        System.out.println(res);
    }
}
