package com.xuqianlei.test;

import com.google.common.collect.Lists;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.client.methods.HttpGet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


/**
 * @Author qixing.chen
 * @Date 2020/11/5 2:45 下午
 */
public class JdbcUtil {

    private final static String SECURITY_KEY = "rx4Sr4zjZgxgC29UZwOwpXxuv6QvLQ1aK4MlF28omWo9dUSMTRzKSzJkzsrUin7E";
    private final static String UID="PL7NPODN";
    private static String encrypt(String str){
        String result = "";
        try {
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
            digest.update(str.getBytes());
            byte [] messageDigest = digest.digest();
            // Create Hex String
            StringBuffer hexString=new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++){
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2){
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            result = hexString.toString();
            return result;

        }catch (java.security.NoSuchAlgorithmException e){

        }
        return result;
    }

    public static void main(String[] args) {

        Map<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("content-type","application/json;charset=utf-8");
        String timestamp = System.currentTimeMillis()+"";
        String nonce = String.valueOf(new java.util.Random().nextInt());
        System.out.println("nonce: " + nonce);
        System.out.println("uid: " + UID);
        System.out.println("time: " + timestamp);

        headerMap.put("X-Nonce", nonce);
        headerMap.put("X-Uid", UID);
        headerMap.put("X-Timestamp",timestamp);

        String signature = encrypt(nonce + ";" + SECURITY_KEY + ";" + timestamp +";" + UID + ";" );
        System.out.println("sign: " + signature);
        headerMap.put("X-Signature",signature);

        Object[] keys = headerMap.keySet().toArray();
        HttpGet httpGet = new HttpGet();
        for (int i = 0; i < keys.length; i++) {
            httpGet.setHeader((String)keys[i], (String)headerMap.get(keys[i]));
        }
    }


}
