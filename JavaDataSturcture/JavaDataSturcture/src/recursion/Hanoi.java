package recursion;

/**
 * Hanoi
 */
public class Hanoi {
    public static void main(String[] args) {
        Hanoi.hanoi(3,'A','B','C');
    }

    /**
     * 
     * @param i 汉诺塔问题的盘子数量
     * @param A 盘子的起始位置
     * @param B 中间位置
     * @param C 目标到达位置
     */
    public static void hanoi(int i,char A,char B,char C) {
        if (i==1) {
            System.out.println("第1个盘子从"+A+"移动到"+C);
        } else {
            //将盘子分为两部分,除了最底下的一个盘子外,其余为上半部分,
            //将上半部分从A移动至B
            Hanoi.hanoi(i-1, A, C, B);
            //将最下层的盘子从A移动至C
            System.out.println("第"+i+"个盘子从"+A+"移动到"+C);
            //将上半部分的盘子从B移动至C
            hanoi(i-1, B, A, C);
        }
    }

    
}