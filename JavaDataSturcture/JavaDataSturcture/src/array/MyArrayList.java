package array;
import java.util.Arrays;;
public class MyArrayList {
    private int[] elements;

    public MyArrayList() {
        elements = new int[0];
    }

    public int getLength() {
        return elements.length;
    }

    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    public void add(int element){
        int[] newArr= new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i]=elements[i];
        }
        newArr[newArr.length-1]=element;
        elements=newArr;
    }

    public void delete(int index) {
        if (index<0||index>elements.length) {
            throw new RuntimeException("无效索引");
        }
        int[] newArr=new int[elements.length-1];
        for (int i = 0; i < newArr.length; i++) {
            if (i<index) {
                newArr[i]=elements[i];                
            } else {
                newArr[i]=elements[i+1];
            }
        }
        elements=newArr;
    }

    public int get(int index) {
        if (index<0||index>elements.length) {
            throw new RuntimeException("无效索引");
        }
        return elements[index];
    }

    public void insert(int index,int element) {
        if (index<0||index>elements.length) {
            throw new RuntimeException("无效索引");
        }
        int[] newArr =new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            if (i<index) {
                newArr[i]=elements[i];
            } else {
                newArr[i+1]=elements[i];
            }
        }
        newArr[index]=element;
        elements=newArr;
    }

    public void update(int index,int element) {
        if (index<0||index>elements.length) {
            throw new RuntimeException("无效索引");
        }
        elements[index]=element;
    }
}