package com.xuqianlei.test;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * GuauaCache class
 *
 * @author qianlei.xu
 * @date 2020/6/1
 */
public class GuauaCache {

    @Test
    public void testCacheLoader() throws ExecutionException {
        LoadingCache userCache = CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterAccess(30, TimeUnit.MINUTES) //过期时间
                .build(new CacheLoader<Object, Object>() {
                    @Override
                    public Object load(Object name) throws Exception {
                        User user = new User();
                        user.setUsername(name.toString());
                        user.setEmail("aaaaaaa@aa.com");
                        return user.toString();
                    }
                });
        System.out.println(userCache.get("leige"));

    }

    @Test
    public void testCallableCache() throws ExecutionException {
        Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(1000).build();
        String leige = cache.get("leige", new Callable<String>() {
            public String call() {
                String str = "Hello" + "leige" + "!";
                return str;
            }
        });
        System.out.println("=============" + leige);
    }

}
