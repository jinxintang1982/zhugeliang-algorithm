package com.company.Tree;

import com.company.LIst.ListNode;
import com.company.LIst.ReorderList2;

/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-02-19 21:01
 **/

public class MainClass {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);


        root.left = node2;
        root.right =node3;
    }
}
