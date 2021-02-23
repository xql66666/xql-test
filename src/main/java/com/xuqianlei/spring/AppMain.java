package com.xuqianlei.spring;

import com.xuqianlei.spring.app.AppConfig;
import com.xuqianlei.spring.dao.Dao;
import com.xuqianlei.spring.dao.DaoTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
        if (dao instanceof Dao) {
            System.out.println("true");
        }
        dao.query();

        /*Class<?>[] interfaces = new Class[]{Dao.class};
        byte[] bytes = ProxyGenerator.generateProxyClass("xqlaaa", interfaces);
        File file = new File("/Users/xql/IdeaProjects/xql-test/src/test/Test.class");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
