package binarytree;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.*;

import static org.junit.Assert.assertEquals;

/**
 * BinarySortTreeTest
 */
public class BinarySortTreeTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testBinarySortTree() {
        BinarySortTree tree = new BinarySortTree(new BinarySortTreeNode(4));
        tree.node.leftNode = new BinarySortTreeNode(2);
        tree.node.leftNode.leftNode = new BinarySortTreeNode(1);
        tree.node.leftNode.rightNode = new BinarySortTreeNode(3);
        tree.node.rightNode = new BinarySortTreeNode(6);
        tree.node.rightNode.leftNode = new BinarySortTreeNode(5);
        tree.node.rightNode.rightNode = new BinarySortTreeNode(7);
        tree.showLDR(tree.node);
        String expected = "1 2 3 4 5 6 7 ";
        assertEquals(expected, systemOutRule.getLog());
    }

    @Test
    public void testSearchTreeNodeValue() {
        BinarySortTree tree = new BinarySortTree(new BinarySortTreeNode(4));
        tree.node.leftNode = new BinarySortTreeNode(2);
        tree.node.leftNode.leftNode = new BinarySortTreeNode(1);
        tree.node.leftNode.rightNode = new BinarySortTreeNode(3);
        tree.node.rightNode = new BinarySortTreeNode(6);
        tree.node.rightNode.leftNode = new BinarySortTreeNode(5);
        tree.node.rightNode.rightNode = new BinarySortTreeNode(7);
        
        String expected=null;
        int val=8;
        String actual;
        if (tree.search(val)==null) {
            actual=null;
        }else{
            actual=tree.search(val).toString();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testDelete() {
        BinarySortTree tree = new BinarySortTree(new BinarySortTreeNode(4));
        tree.node.leftNode = new BinarySortTreeNode(2);
        tree.node.leftNode.leftNode = new BinarySortTreeNode(1);
        tree.node.leftNode.rightNode = new BinarySortTreeNode(3);
        tree.node.rightNode = new BinarySortTreeNode(6);
        // tree.node.rightNode.leftNode = new BinarySortTreeNode(5);
        tree.node.rightNode.rightNode = new BinarySortTreeNode(7);

        tree.deleteNode(4);
        tree.showLDR(tree.node);
        String expected = "1 2 3 6 7 ";
        assertEquals(expected, systemOutRule.getLog());
    }

    @Test
    public void testInsert() {
        BinarySortTree tree = new BinarySortTree(new BinarySortTreeNode(40));
        tree.node.leftNode = new BinarySortTreeNode(20);
        tree.node.leftNode.leftNode = new BinarySortTreeNode(10);
        tree.node.leftNode.rightNode = new BinarySortTreeNode(30);
        tree.node.rightNode = new BinarySortTreeNode(60);
        tree.node.rightNode.leftNode = new BinarySortTreeNode(50);
        tree.node.rightNode.rightNode = new BinarySortTreeNode(70);

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        // String expected = "10 10 20 20 30 30 40 40 50 50 60 60 70 70 ";

        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);
        tree.insert(45);
        tree.insert(55);
        tree.insert(65);
        tree.insert(75);

        tree.showLDR(tree.node);
        String expected = "5 10 10 15 20 20 25 30 30 35 40 40 45 50 50 55 60 60 65 70 70 75 ";
        assertEquals(expected, systemOutRule.getLog());
    }
}