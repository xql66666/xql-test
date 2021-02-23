package com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao;

import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void query(){
        System.out.println("假装查询数据库");
    }

    @Override
    public void query(String aa){
        System.out.println(aa);
    }
}
