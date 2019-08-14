package binarytree;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.*;

import static org.junit.Assert.assertEquals;

/**
 * ArrayBinaryTreeTest
 */
public class ArrayBinaryTreeTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Test
    public void testArrayBinaryTree() {
        ArrayBinaryTree tree1=new ArrayBinaryTree(new int[]{1,2,3,4,5,6,7});
        //前序遍历
        // tree1.showDLR();
        // String expected="1 2 4 5 3 6 7 ";
        //中序遍历
        // tree1.showLDR();
        // String expected="4 2 5 1 6 3 7 ";
        //后序遍历
        tree1.showLRD();
        String expected="4 5 2 6 7 3 1 ";
        //断言测试
        assertEquals(expected, systemOutRule.getLog());
    }
}