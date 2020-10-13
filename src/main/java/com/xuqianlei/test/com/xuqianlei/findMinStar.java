package com.xuqianlei.test.com.xuqianlei;

import java.util.Collections;
import java.util.LinkedList;

/**
 * findMinStar class
 *
 * @author qianlei.xu
 * @date 2020/9/15
 * 举例：
 * 输入:
 * arr = [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 */
public class findMinStar {

    public static int uniquePaths(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        if (m <= 0 || n <= 0) {
            return 0;
        }

        int[][] dp = new int[m][n]; //
        // 初始化
        dp[0][0] = arr[0][0];
        // 初始化最左边的列
        for(int i = 1; i < m; i++){
            dp[i][0] = dp[i-1][0] + arr[i][0];
        }
        // 初始化最上边的行
        for(int i = 1; i < n; i++){
            dp[0][i] = dp[0][i-1] + arr[0][i];
        }
        // 推导出 dp[m-1][n-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + arr[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int i = uniquePaths(arr);
        System.out.println("====" + i);
        LinkedList<Integer> stack = new LinkedList<>();
    }


}
