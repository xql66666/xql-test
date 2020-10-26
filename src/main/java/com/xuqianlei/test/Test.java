package com.xuqianlei.test;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tinkerpop.gremlin.structure.T;

/**
 * Test class
 *
 * @author qianlei.xu
 * @date 2020/9/7
 */
public class Test {
    public static void main(String[] args) {
        String a = "";
        String s = DigestUtils.md5Hex(a);
        System.out.println(s);


    }
    ////return (int) ((d1.getTime() - d2.getTime())/(24*3600*1000));
}
