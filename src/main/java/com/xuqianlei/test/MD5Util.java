package com.xuqianlei.test;

import sun.tools.jconsole.inspector.Utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * MD5Util class
 *
 * @author qianlei.xu
 * @date 2020/5/25
 */
public class MD5Util {

    public static void main(String[] args) {
        //String value = getMd5Value("腾讯");
        String companyname = "腾讯计算机";
        String rowkey =SecretUtil.md5(companyname);
        System.out.println(rowkey);
    }

    public static String getMd5Value(String value){
        try {
            //1. 获得md5加密算法工具类
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //2. 加密的结果为十进制
            byte[] md5Bytes = messageDigest.digest(value.getBytes());
            //3. 将md5加密算法值转化为16进制
            BigInteger bigInteger = new BigInteger(1, md5Bytes);
            return bigInteger.toString(16);
        } catch (Exception e) {
            //如果产生错误则抛出异常
            throw new RuntimeException();
        }
    }
}
