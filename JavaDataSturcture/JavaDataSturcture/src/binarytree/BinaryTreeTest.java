package binarytree;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.*;

import static org.junit.Assert.assertEquals;

/**
 * BinaryTreeTest
 */
public class BinaryTreeTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Test
    public void TestBinaryTree(){

        BinaryTree tree1=new BinaryTree(new TreeNode(1));
        tree1.root.leftNode=new TreeNode(2);
        tree1.root.rightNode=new TreeNode(3);

        tree1.root.leftNode.leftNode=new TreeNode(4);
        tree1.root.leftNode.rightNode=new TreeNode(5);

        tree1.root.rightNode.leftNode=new TreeNode(6);
        tree1.root.rightNode.rightNode=new TreeNode(7);
        
        //前序遍历
        //tree1.showDLR();
        //String expected="1 2 4 5 3 6 7 ";

        //中序遍历
        //tree1.showLDR();
        //String expected="4 2 5 1 6 3 7 ";

        //后序遍历
        tree1.showLRD();
        String expected="4 5 2 6 7 3 1 ";

        //判断
        assertEquals(expected, systemOutRule.getLog());

    }
}