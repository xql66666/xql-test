package com.xuqianlei.test.com.xuqianlei;

/**
 * ArrayMaxCount class
 *
 * @author qianlei.xu
 * @date 2020/9/16
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *  
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/59gq9c/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class ArrayMaxCount {
    public static int maxSubArray(int[] nums) {
                int res = nums[0];
                for(int i = 1; i < nums.length; i++) {
                    nums[i] += Math.max(nums[i - 1], 0);
                    res = Math.max(res, nums[i]);
                }
                return res;

    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
