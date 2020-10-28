package com.xuqianlei.spring;

import com.xuqianlei.spring.app.AppConfig;
import com.xuqianlei.spring.dao.DaoTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AppMain class
 *
 * @author qianlei.xu
 * @date 2020/10/28
 */
public class AppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DaoTest dao = applicationContext.getBean(DaoTest.class);
        dao.query();


    }
}
