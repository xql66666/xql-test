package com.xuqianlei.test.com.xuqianlei;

/**
 * qingwatiaotaijie class
 *
 * @author qianlei.xu
 * @date 2020/9/16
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：1
 *
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/57hyl5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class qingwatiaotaijie {
    public static int numWays(int n) {
        int[] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;
        num[2] = 2;
        if (n <=2) {
            return num[n];
        }
        for (int i = 3; i <= n; i++) {
            num[i] = (num[i-1] + num[i-2]) % 1000000007;
        }
        return num[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
}
