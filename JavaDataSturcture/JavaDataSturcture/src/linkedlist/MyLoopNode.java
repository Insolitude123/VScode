package linkedlist;

import org.junit.Test;

public class MyLoopNode {
    private int val;
    private MyLoopNode next = this;
    private int size = 0;

    public MyLoopNode(int val) {
        this.val = val;
        size++;
    }

    @Test
    public void append(int nextVal) {
        MyLoopNode currentNode = this;
        while (true) {
            MyLoopNode nextNode = currentNode.next;
            if (nextNode == this) {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = new MyLoopNode(nextVal);
        currentNode.next.next = this;
        size++;
    }

    @Test
    public void delete(int index) {
        if (index <= 0 || index > size || size == 0) {
            throw new RuntimeException("Index error");
        }
        MyLoopNode currentNode = this;
        MyLoopNode newNext = next.next;
        if (index == 1) {
            this.val = this.next.val;
            currentNode.next = newNext;
        } else {
            for (int i = 2; i <= index; i++) {
                if (i == index) {
                    currentNode.next = newNext;
                }
                if (newNext == this) {
                    break;
                }
                currentNode = currentNode.next;
                newNext = currentNode.next.next;

            }
        }
        size--;
    }

    @Test
    public void insert(int index,int val) {
        if (index > size || index <= 0) {
            throw new RuntimeException("Index error");
        }
        MyLoopNode currentNode = this;
        MyLoopNode newNode = new MyLoopNode(val);
        if (index == 1) {
            this.val = this.val ^ newNode.val;
            newNode.val = this.val ^ newNode.val;
            this.val = this.val ^ newNode.val;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else {
            for (int i = 2; i <= index; i++) {
                if (i == index) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        size++;
    }

    @Test
    public void show() {
        if (size == 0) {
            throw new RuntimeException("This linked list is null");
        }
        MyLoopNode currentNode = this;
        System.out.print("LinkedList:");
        int i = 1;
        while (i > size) {
            System.out.print(currentNode.val + " -->");
            currentNode = currentNode.next;
            i++;
        }
        System.out.println(currentNode);
    }

    public MyLoopNode getNext() {
        return this.next;
    }

    public int getVal() {
        return this.val;
    }

    public void getSize() {
        System.out.println("size="+size);;
    }

    public boolean isLast() {
        return next == null;
    }
}