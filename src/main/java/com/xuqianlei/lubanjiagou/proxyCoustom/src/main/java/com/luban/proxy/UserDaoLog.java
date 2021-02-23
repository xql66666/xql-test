package com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.proxy;

import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao.UserDao;

/**
 * UserDaoLog class
 *
 * @author qianlei.xu
 * @date 2020/11/2
 */
public class UserDaoLog implements UserDao {
    public UserDao dao;
    public UserDaoLog (UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void query() {
        System.out.println("log...");
        dao.query();
    }

    @Override
    public void query(String p) {

    }
}
