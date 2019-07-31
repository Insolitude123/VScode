package stackandqueue;
public class TestMyStack {
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