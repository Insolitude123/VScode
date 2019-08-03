package linkedlist;

public class MyNode {
    private int val;
    private MyNode next;
    private int size = 0;

    public MyNode(int val) {
        this.val = val;
        size++;
    }

    public void append(int nextVal) {
        MyNode currentNode = this;
        while (true) {
            MyNode nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = new MyNode(nextVal);
        size++;
    }

    public static MyNode arrayToMyNode(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException();
        }
        MyNode root = new MyNode(arr[0]);
        MyNode other = root;
        for (int i = 1; i < arr.length; i++) {
            root.next = new MyNode(arr[i]);
            root = root.next;
        }
        root.size = arr.length;
        return other;
    }

    public void delete(int index) {
        if (index <= 0 || index > size || size == 0) {
            throw new RuntimeException("Index error");
        }
        MyNode currentNode = this;
        MyNode newNext = next.next;
        if (index == 1) {
            this.val = this.next.val;
            currentNode.next = newNext;
        } else {
            for (int i = 2; i <= index; i++) {
                if (i == index) {
                    currentNode.next = newNext;
                }
                currentNode = currentNode.next;
                if (currentNode != null) {
                    newNext = currentNode.next.next;
                }
            }
        }
        size--;
    }

    public void insert(int index, int val) {
        if (index > size + 1 || index <= 0) {
            throw new RuntimeException("Index error");
        }
        MyNode currentNode = this;
        MyNode newNode = new MyNode(val);
        if (index == 1) {
            this.val = this.val ^ newNode.val;
            newNode.val = this.val ^ newNode.val;
            this.val = this.val ^ newNode.val;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

        for (int i = 2; i <= index; i++) {
            if (i == index) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;

        }
        size++;
    }

    public void show() {
        if (size == 0) {
            throw new RuntimeException("This linked list is null");
        }
        MyNode currentNode = this;
        System.out.print("LinkedList:");
        while (currentNode != null) {
            System.out.print(currentNode.val + " -->");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode);
    }

    public MyNode getNext() {
        return this.next;
    }

    public int getVal() {
        return this.val;
    }

    public void getSize() {
        System.out.println("size=" + size);
    }

    public boolean isLast() {
        return next == null;
    }
}