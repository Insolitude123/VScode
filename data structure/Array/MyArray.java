import java.util.Arrays;

public class MyArray {
    public static void main(String[] args){ 
        int[] elements = new int[3];
        elements[2]=10;
        System.out.println("elements.length="+elements.length);
        System.out.println("==========");
        for (int i = 0; i < elements.length; i++) {
            System.out.println("element["+i+"]="+elements[i]);
        }
        System.out.println("==========");
        int[] oldArr = new int[]{9,8,7};
        int element = 2;
        int index =1;

        int[] arr=new int[oldArr.length+1];
        for (int i = 0; i < oldArr.length; i++) {
            if (i<index) {
                arr[i]=oldArr[i];
            } else {
                arr[i+1]=oldArr[i];
            }
        }
        arr[index]=element;
        oldArr=arr;
        
        System.out.println(Arrays.toString(oldArr));
        
        System.out.println("=========");

        index=2;
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < newArr.length; i++) {
            if (i<index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}