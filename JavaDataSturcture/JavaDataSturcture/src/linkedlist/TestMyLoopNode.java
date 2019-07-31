package linkedlist;

public class TestMyLoopNode {
    public static void main(String[] args) {
        MyLoopNode mln=new MyLoopNode(1);
        mln.append(2);
        mln.append(3);
        mln.append(4);
        mln.append(5);
        mln.getSize();
        mln.show();
        mln.insert(3, 7);
        mln.insert(7, 9);
        mln.insert(1, 0);
        mln.getSize();
        mln.show();
        mln.delete(1);
        mln.delete(7);
        mln.getSize();
        mln.show();

    }
    
}