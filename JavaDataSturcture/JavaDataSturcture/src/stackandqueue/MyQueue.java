package stackandqueue;
/**
 * MyQueue
 */
public class MyQueue {
    private int[] elements;
    
    public MyQueue(){
        elements=new int[0];
    }

    public void add(int element) {
        int[] newArr=new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i]=elements[i];
        }
        newArr[newArr.length-1]=element;
        elements=newArr;
    }

    public int poll(){
        if (elements.length==0) {
            throw new RuntimeException("Queue is Empty");
        }
        int[] newArr=new int[elements.length-1];
        int element=elements[0];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=elements[i+1];
        }
        elements=newArr;
        return element;
    }

    public int peek() {
        return elements[0];
    }

    public boolean isEmpty(){
        return elements.length==0;
    }
}