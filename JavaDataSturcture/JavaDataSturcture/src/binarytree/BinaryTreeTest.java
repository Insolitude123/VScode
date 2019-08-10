package binarytree;

import org.junit.Test;

/**
 * BinaryTreeTest
 */
public class BinaryTreeTest {
    @Test
    public void TestBinaryTree(){
        BinaryTree tree1=new BinaryTree(new TreeNode(1));
        tree1.root.leftNode=new TreeNode(2);
        tree1.root.rightNode=new TreeNode(3);

        tree1.root.leftNode.leftNode=new TreeNode(4);
        tree1.root.leftNode.rightNode=new TreeNode(5);
        tree1.root.rightNode.leftNode=new TreeNode(6);
        tree1.root.rightNode.rightNode=new TreeNode(7);


    }
}