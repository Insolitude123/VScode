/**
 * ArraySearch
 */
public class ArraySearch {
    public static void main(String[] args) {
        //线性查找
        int[] arr= new int[]{9,7,2,4,51,62,72,23,1};
        int target=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                index=i;
            }
        }
        System.out.println("index="+index);

        //二分法查找
        arr=new int[]{1,2,3,4,5,6,7,8,9};
        target=1;
        index=-1;
        int begin=0;
        int end=arr.length-1;
        int mid=(begin+end)/2;
        while (begin<=end) {
            if (arr[mid]==target) {
                index=mid;
                break;
            } else if(arr[mid]>target){
                end=mid-1;
            }else{
                begin=mid+1;
            }
            mid=(begin+end)/2;
        }
        System.out.println("index="+index);
    }

}