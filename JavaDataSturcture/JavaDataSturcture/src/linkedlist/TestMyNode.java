package linkedlist;
public class TestMyNode {
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
        mn.insert(6, 10);
        mn.insert(2, 7);
        mn.getSize();
        mn.show();
                
    }
}