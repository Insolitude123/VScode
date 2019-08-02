package stackandqueue;

import org.junit.Test;
import org.junit.Assert;

public class MyQueueTest {
    @Test
    public void test1() {
        MyQueue mq = new MyQueue();
        mq.add(1);
        mq.add(8);
        mq.add(2);
        mq.add(4);
        mq.add(3);
        mq.add(7);
        mq.add(9);
        Assert.assertEquals(1, mq.poll());
        Assert.assertEquals(8, mq.poll());
        Assert.assertEquals(2, mq.poll());
        Assert.assertEquals(4, mq.poll());
        Assert.assertEquals(3, mq.poll());
        Assert.assertEquals(7, mq.poll());
        Assert.assertEquals(9, mq.peek());

    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.add(1);
        mq.add(8);
        mq.add(2);
        mq.add(4);
        mq.add(3);
        mq.add(7);
        mq.add(9);
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());

        System.out.println(mq.peek());

    }
}