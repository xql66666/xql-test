package com.xuqianlei.test.com.xuqianlei;

/**
 * findStar class
 *
 * @author qianlei.xu
 * @date 2020/9/15
 */
public class findStar {
    public static int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }

        int[][] dp = new int[m][n]; //
        // 初始化
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < n; i++){
            dp[0][i] = 1;
        }
        // 推导出 dp[m-1][n-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        for (int i = 0; i < dp[0].length; i++) {
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println("========" + uniquePaths(6,6));

    }
}
