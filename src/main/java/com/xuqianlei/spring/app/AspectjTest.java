package com.xuqianlei.spring.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Aspectj class
 *
 * @author qianlei.xu
 * @date 2020/10/28
 */
@Component
@Aspect
public class AspectjTest {

    @Pointcut("execution(* com.xuqianlei.spring.dao.*.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before1");
    }
}
