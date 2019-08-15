package binarytree;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;

/**
 * BinaryTreeTest
 */
public class BinaryTreeTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testBinaryTree() {
        BinaryTree tree1 = new BinaryTree(new TreeNode(1));
        tree1.root.leftNode = new TreeNode(2);
        tree1.root.rightNode = new TreeNode(3);

        tree1.root.leftNode.leftNode = new TreeNode(4);
        tree1.root.leftNode.rightNode = new TreeNode(5);

        tree1.root.rightNode.leftNode = new TreeNode(6);
        tree1.root.rightNode.rightNode = new TreeNode(7);

        // 前序遍历
        // tree1.showDLR();
        // String expected="1 2 4 5 3 6 7 ";

        // 中序遍历
        // tree1.showLDR();
        // String expected="4 2 5 1 6 3 7 ";

        // 后序遍历
        tree1.showLRD();
        String expected = "4 5 2 6 7 3 1 ";

        // 判断
        assertEquals(expected, systemOutRule.getLog());

    }

    @Test
    public void testBinaryTreeSearch() {
        BinaryTree tree1 = new BinaryTree(new TreeNode(1));
        tree1.root.leftNode = new TreeNode(2);
        tree1.root.rightNode = new TreeNode(3);

        tree1.root.leftNode.leftNode = new TreeNode(4);
        tree1.root.leftNode.rightNode = new TreeNode(5);

        tree1.root.rightNode.leftNode = new TreeNode(6);
        tree1.root.rightNode.rightNode = new TreeNode(7);
        //前序遍历查找
        //TreeNode result = tree1.root.searchDLR(8);
        //中序遍历查找
        // TreeNode result = tree1.root.searchDLR(7);
        //后序遍历查找
        TreeNode result = tree1.root.searchDLR(1);
        //测试

        String actual=null;
        if (result!=null) {
        actual=result.toString();
        }    

        String expected =null;
        if (actual!=null) {
            expected = "1";
        } 
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryTreeDelete() {
        BinaryTree tree1 = new BinaryTree(new TreeNode(1));
        tree1.root.leftNode = new TreeNode(2);
        tree1.root.rightNode = new TreeNode(3);

        tree1.root.leftNode.leftNode = new TreeNode(4);
        tree1.root.leftNode.rightNode = new TreeNode(5);

        tree1.root.rightNode.leftNode = new TreeNode(6);
        tree1.root.rightNode.rightNode = new TreeNode(7);
        // tree1.deleteNode(1);// String expected="null";
        //若输出为println,因ln换行会导致与expected变量不一致报错
        tree1.deleteNode(3);
        // 前序遍历
        tree1.showDLR();
        String expected="1 2 4 5 ";
        //判断
        assertEquals(expected, systemOutRule.getLog());

    }

    @Test
    public void testArrayToTree() {
        //array to tree
        BinaryTree tree1=new BinaryTree();
        int[] arr=new int[]{1,2,3,4,5,6};
        TreeNode root=tree1.arrayToTree(arr);
        root.showDLR();

        // String expected = "1 2 4 5 3 6 ";
        // 判断
        // assertEquals(expected, systemOutRule.getLog());

        int[] actuals=tree1.treeToArray(root);
        assertArrayEquals(arr, actuals);
    }

    @Test
    public void testTreeToArray() {
        //tree to array
        BinaryTree tree1 = new BinaryTree(new TreeNode(1));
        tree1.root.leftNode = new TreeNode(2);
        tree1.root.rightNode = new TreeNode(3);

        tree1.root.leftNode.leftNode = new TreeNode(4);
        tree1.root.leftNode.rightNode = new TreeNode(5);

        tree1.root.rightNode.leftNode = new TreeNode(6);
        tree1.root.rightNode.rightNode = new TreeNode(7);


        int[] actual=tree1.treeToArray(tree1.root);
        // int[] expecteds=new int[tree1.root.getTreeSize(tree1.root, 0)];
        // for (int i = 0; i < expecteds.length; i++) {
        //     expecteds[i]=i+1;
        // }
        // assertArrayEquals(expecteds, actuals);

        BinaryTree tree2=new BinaryTree();
        tree2.root=tree1.arrayToTree(actual);

        String s1=tree1.toString();
        String s2=tree2.toString();
        //若断言的期望值和实际值输入tree1和tree2会判断错误
        Assert.assertEquals(s1, s2);
    }
}