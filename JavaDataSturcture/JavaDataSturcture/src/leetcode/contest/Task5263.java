package leetcode.contest;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
/**
 * Task5263
 * 二维网格迁移 显示英文描述 
用户通过次数0
用户尝试次数0
通过次数0
提交次数0
题目难度Easy
给你一个 n 行 m 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。

每次「迁移」操作将会引发下述活动：

位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
位于 grid[i][m - 1] 的元素将会移动到 grid[i + 1][0]。
位于 grid[n - 1][m - 1] 的元素将会移动到 grid[0][0]。
请你返回 k 次迁移操作后最终得到的 二维网格。
 */
public class Task5263 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[][] newGrid=new int[grid.length][];
        
        int[][] oldGrid=new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            oldGrid[i]=new int[grid[i].length];
            newGrid[i]=new int[grid[i].length];
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                oldGrid[i][j]=grid[i][j];
            }
        }

        for (int n = 1; n <= k; n++) {
            newGrid[0][0]=oldGrid[oldGrid.length-1][oldGrid[oldGrid.length-1].length-1];
            for (int i = 0; i < oldGrid.length; i++) {
                for (int j = oldGrid[i].length-2; j >= 0; j--) {
                    newGrid[i][j+1]=oldGrid[i][j];
                }
                if (i!=oldGrid.length-1) {
                    newGrid[i+1][0]=oldGrid[i][oldGrid[i].length-1];
                }
            }
            for (int i = 0; i < newGrid.length; i++) {
                for (int j = 0; j < newGrid[i].length; j++) {
                    oldGrid[i][j]=newGrid[i][j];
                }
            }
        }

        Integer[] integers;
        List<List<Integer>> lists=new ArrayList<>();

        List<Integer> list;
        for (int i = 0; i < oldGrid.length; i++) {
            integers=new Integer[oldGrid[i].length];
            for (int j = 0; j < integers.length; j++) {
                integers[j]=oldGrid[i][j];
            }
            list = new ArrayList<>(Arrays.asList(integers));
            lists.add(list);
        }
        return lists;
    }
}