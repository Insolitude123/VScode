package array;

import org.junit.Test;
import org.junit.Assert;

public class MyArrayListTest {
    @Test
    public void test1() {
        MyArrayList mal=new MyArrayList();
        mal.add(6);
        mal.add(4);
        mal.add(9);
        mal.show();
        mal.insert(2, 10);
        mal.insert(0, 3);
        mal.insert(4, 22);
        Assert.assertEquals(6, mal.getLength());
        
        mal.show();
        mal.delete(5);
        mal.delete(0);
        mal.show();
        mal.update(1, 7);
        Assert.assertEquals(4, mal.getLength());

        Assert.assertEquals(6, mal.get(0));
        Assert.assertEquals(7, mal.get(1));
        Assert.assertEquals(10, mal.get(2));
        Assert.assertEquals(22, mal.get(3));

        mal.show();

    }

    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();
        mal.add(6);
        mal.add(4);
        mal.add(9);
        mal.show();
        mal.insert(2, 10);
        mal.insert(0, 3);
        mal.insert(4, 22);
        System.out.println(mal.getLength());
        mal.show();
        mal.delete(5);
        mal.delete(0);
        mal.show();
        mal.update(1, 7);
        System.out.println(mal.get(1));
        System.out.println(mal.getLength());
        mal.show();

    }

}