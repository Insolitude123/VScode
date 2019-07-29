public class TestMyQueue{
    public static void main(String[] args) {
        MyQueue mq=new MyQueue();
        mq.add(1);
        mq.add(8);
        mq.add(2);
        mq.add(4);
        mq.add(3);
        mq.add(7);
        mq.add(9);
        System.out.println(mq.peek());
        System.out.println(mq.poll());
        System.out.println(mq.peek());
        System.out.println(mq.poll());
        System.out.println(mq.peek());
        System.out.println(mq.poll());
        System.out.println(mq.peek());
        System.out.println(mq.poll());
        System.out.println(mq.peek());
        System.out.println(mq.poll());
        System.out.println(mq.peek());
        System.out.println(mq.poll());
        System.out.println(mq.peek());
    }
}