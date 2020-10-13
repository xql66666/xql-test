package com.xuqianlei.test;

import sun.jvm.hotspot.runtime.Bytes;

import java.util.Random;

/**
 * MD5Test01 class
 *
 * @author qianlei.xu
 * @date 2020/5/29
 */
public class MD5Test01 {


    //interface
    public interface RowKeyGenerator {
        byte [] nextId();
    }

}
