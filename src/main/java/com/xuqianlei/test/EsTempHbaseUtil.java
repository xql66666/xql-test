package com.xuqianlei.test;

import java.util.Scanner;

public class EsTempHbaseUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowkey = 144;
        for (int i=0; i<27; i++){
            String s = scanner.nextLine();
            String[] split = s.split(":");
            String a = split[0].substring(1, split[0].length()-1);
            String b = split[1].substring(1, split[1].length()-2);

            if (i == 0) {
                System.out.println();
            }
            System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:" +a+ "','" +b+ "'");
        }
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:hngy','" +0+ "'");
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:ssgs','" +0+ "'");
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:hmd','" +0+ "'");
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:dbq','" +"双向担保"+ "'");
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:sxy','" +0+ "'");
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:cpbq','" +"cpbq"+ "'");
        System.out.println("put 'gf_duigong:qygsxx','" +rowkey+ "','jbxx:gszch','" +"420100000046785"+ "'");

    }
}
