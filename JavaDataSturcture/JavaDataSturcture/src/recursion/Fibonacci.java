package recursion;

/**
 * Recursion
 * 斐波那契数列:1,1,2,3,5,8,13
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.getResult(7));
        
    }

    /**
     * 
     * @param i 想得到的代表斐波那契数列的第几个数字
     */
    public static int getResult(int i) {
        if (i==1||i==2) {
            return 1;
        } else {
            return getResult(i-1)+getResult(i-2);
        }
        
    }
    
}