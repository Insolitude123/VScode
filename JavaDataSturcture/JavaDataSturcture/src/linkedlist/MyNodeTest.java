package linkedlist;

import org.junit.Test;
import org.junit.Assert;

public class MyNodeTest {
    @Test
    public void test1() {
        MyNode mn=new MyNode(1);
        mn.append(2);
        mn.append(3);
        mn.append(4);
        mn.append(5);
        mn.append(6);
        Assert.assertEquals(2,mn.getNext().getVal());
        Assert.assertFalse(mn.getNext().getNext().isLast());
        mn.show();
        mn.delete(6);
        mn.getSize();
        mn.show();
        mn.delete(1);
        mn.getSize();
        mn.show();
        mn.insert(1, 9);
        mn.getSize();
        mn.insert(6, 10);
        mn.insert(2, 7);
        mn.getSize();
        mn.show();
        MyNode newMN = MyNode.arrayToMyNode(new int[]{0,1,2,3,4,5});
        newMN.show();
    }

    public static void main(String[] args) {
        MyNode mn=new MyNode(1);
        mn.append(2);
        mn.append(3);
        mn.append(4);
        mn.append(5);
        mn.append(6);
        System.out.println(mn.getNext().getVal());
        System.out.println(mn.getNext().getNext().isLast());
        mn.getSize();
        mn.show();
        mn.delete(6);
        mn.getSize();
        mn.show();
        mn.delete(1);
        mn.getSize();
        mn.show();
        mn.insert(1, 9);
        mn.getSize();
        mn.insert(6, 10);
        mn.insert(2, 7);
        mn.getSize();
        mn.show();
        MyNode newMN = MyNode.arrayToMyNode(new int[]{0,1,2,3,4,5});
        newMN.show();
                
    }
}