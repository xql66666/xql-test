package com.xuqianlei.leetcode.mianshihuizong.part01;

import com.sun.imageio.plugins.common.I18N;

/**
 * Class02 class
 *
 * @author qianlei.xu
 * @date 2020/9/10
 * 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xm77tm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Class02 {

    //桶-负数就gg
    public static int majorityElement(int[] nums) {
        int[] sums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            ++sums[nums[i]];
            if (sums[nums[i]] > nums.length/2) {
                return nums[i];
            }
        }
        return 0;
    }

    //从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
    public static int majorityElement1(int[] nums) {
        int count = 1;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    num = nums[i+1];
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int i = majorityElement1(nums);
        System.out.println("======" + i);
    }
}
