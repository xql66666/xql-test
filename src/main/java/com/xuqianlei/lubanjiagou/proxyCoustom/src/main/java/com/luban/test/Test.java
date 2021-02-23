package com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.test;



import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao.LubanDao;
import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao.LubanDaoImpl;
import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.proxy.ProxyUtil;

import java.lang.reflect.Proxy;


public class Test {
    public static void main(String[] args) {

        LubanDao proxy = (LubanDao) ProxyUtil.newInstance(new LubanDaoImpl());
        proxy.query();

    }
}
