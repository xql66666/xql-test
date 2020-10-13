package com.xuqianlei.leetcode.mianshihuizong.part01;

/**
 * Class04 class
 *
 * @author qianlei.xu
 * @date 2020/9/10
 *
 * 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 *  
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 *
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xmi2l7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Class04 {

        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = 0;
            int j = 0;
            int k = 0;
            int[] arr = new int[n+m];
            while(j<m || k<n) {
                //注意两个边界条件:j==m，以及k==n，表示一个数组已经拷贝完了
                if(j==m) {
                    arr[i++] = nums2[k++];
                }
                else if(k==n) {
                    arr[i++] = nums1[j++];
                }
                else if(nums1[j]<=nums2[k]) {
                    arr[i++] = nums1[j++];
                }
                else {
                    arr[i++] = nums2[k++];
                }
            }
            //还需要将新数组中的元素再拷贝回去
            for(i=0;i<arr.length;++i) {
                nums1[i] = arr[i];
            }
        }


}
