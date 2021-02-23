package com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.util;

import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao.UserDaoImpl;
import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.proxy.UserDaoLog;

public class Test {

    public static void main(String[] args) {
        UserDaoImpl target = new UserDaoImpl();
        UserDaoLog proxy = new UserDaoLog(target);
        proxy.query();

    }

}
