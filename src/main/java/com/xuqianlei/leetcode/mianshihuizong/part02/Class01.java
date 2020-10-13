package com.xuqianlei.leetcode.mianshihuizong.part02;

import org.apache.ivy.util.DateUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Class01 class
 *
 * @author qianlei.xu
 * @date 2020/9/11
 *
 * 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xah8k6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Class01 {


    public static void main(String[] args) {
        LocalDate today = LocalDate.now().minusDays(1);
        LocalDate today1 = LocalDate.now(ZoneId.of("UTC+8"));
        LocalDate aa = today1.minusDays(1);
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime bb = LocalDateTime.now().minusHours(-8);
        LocalDateTime today2 = LocalDateTime.now(ZoneId.of("UTC"));

        System.out.println("=====" + today1);
        System.out.println("=====" + today2);
        System.out.println("=====" + aa);
        System.out.println("=====" + bb);
       // System.out.println("========" + yyyymmddhHmiss);
    }


}
