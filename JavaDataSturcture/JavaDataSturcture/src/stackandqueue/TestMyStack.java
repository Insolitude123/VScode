package stackandqueue;

import org.junit.Test;

public class TestMyStack {
    @Test
    public void test1() {
        MyStack ms=new MyStack();
        System.out.println(ms.isEmpty());
        ms.push(7);
        ms.push(5);
        ms.push(8);
        ms.push(4);
        ms.push(1);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
    }

    public static void main(String[] args) {
        MyStack ms=new MyStack();
        System.out.println(ms.isEmpty());
        ms.push(7);
        ms.push(5);
        ms.push(8);
        ms.push(4);
        ms.push(1);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
    }
    
}