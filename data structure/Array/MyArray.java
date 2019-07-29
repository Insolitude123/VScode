import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        //创建一个数组
        int[] elements = new int[3];
        //对数组中第三个元素赋值
        elements[2]=10;
        //输出数组的长度
        System.out.println("elements.length="+elements.length);
        System.out.println("==========");
        //遍历数组,输出每一个元素的值
        for (int i = 0; i < elements.length; i++) {
            System.out.println("element["+i+"]="+elements[i]);
        }
        System.out.println("==========");
        //解决数组长度不可变问题
        int[] oldArr = new int[]{9,8,7};
        //设置插入元素的数值和索引
        int element = 2;
        int index =1;

        int[] arr=new int[oldArr.length+1];
        //遍历并给新数组赋值
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
        //删除数组中某一元素并将最后一个多余位置删除
        //设置需要删除的元素的索引
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