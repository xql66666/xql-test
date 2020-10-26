package com.xuqianlei.test;

import com.xuqianlei.test.com.GetMemoryAddress;
import org.apache.commons.lang3.StringUtils;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * DateSortTest class
 *
 * @author qianlei.xu
 * @date 2020/10/13
 */

public class DateSortTest {

    public static int i = 0;
   // private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static int dateSort(String o1, String o2) {
        try {
            //System.out.println(i++);

            if ((StringUtils.isBlank(o1) || "--".equals(o1)) && (!StringUtils.isBlank(o2) && !"--".equals(o2))) {
                System.out.println("o1:" + o1 + "o2:" + o2 + "=========1");
                return 1;
            }
            if ((StringUtils.isBlank(o2) || "--".equals(o2)) && (!StringUtils.isBlank(o1) && !"--".equals(o1))) {
                System.out.println("o1:" + o1 + "o2:" + o2 + "=========-1");
                return -1;
            }
            if ((StringUtils.isBlank(o1) || "--".equals(o1)) && (StringUtils.isBlank(o2) || "--".equals(o2))) {
                System.out.println("o1:" + o1 + "o2:" + o2 + "=========0");
                return 0;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //GetMemoryAddress.printAddresses("Address", sdf);
            //return Long.compare(ThreadLocalDateUtil.parse(o2).getTime(), ThreadLocalDateUtil.parse(o1).getTime());

            return Long.compare(sdf.parse(o2).getTime(), sdf.parse(o1).getTime());
           /* return Long.compare(
                    LocalDateTime.from(LocalDateTime.parse(o1, ftf)).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
                    LocalDateTime.from(LocalDateTime.parse(o1, ftf)).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());*/
        } catch (Exception e) {
            System.out.println("日期格式转换错误, date1:" + o1 + "=========" + "date2:" + o2);
            return o2.compareTo(o1);
        }
        //return 0;
    }





    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Random r = new Random(1);
        for (int j = 0; j < 100; j++) {
            String aaa = String.valueOf(r.nextInt(10000)) + "--" + String.valueOf(r.nextInt(100)) + "--" +String.valueOf(r.nextInt(100));
            list.add(aaa);
        }


        list.add("2017-01-01");
        list.add("2016-01-01");
        list.add("2015-01-01");
        list.add("--");
        list.add("--");
        //list.add(null);
        //list.add(null);
        list.add("2017-01-01");
        list.add("2017-01-27");
        list.add("2017-01-26");
        list.add("2017-01-25");
        list.add("2017-01-24");
        list.add("2017-01-23");
        list.add("2017-01-22");
        list.add("2017-01-21");
        list.add("2017-01-20");
        list.add("2017-01-19");
        list.add("2017-01-18");
        list.add("2017-01-17");
        list.add("2017-01-16");
        list.add("2017-01-15");
        list.add("2017-01-01");
        list.add("2017-01-02");
        list.add("2017-01-03");
        list.add("2017-01-04");
        list.add("2017-01-05");
        list.add("2017-01-06");
        list.add("2017-01-07");
        list.add("2017-01-08");
        list.add("2017-01-09");
        list.add("2017-01-10");
        list.add("2017-01-11");
        list.add("2017-01-12");
        //32条数据 注释掉一条就不会报错
        list.add("2017-01-13");
        //先字符串排序一遍
        //Collections.sort(list);
        //换用1.6那种排序方式
        //System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");

        long heapSize1 = Runtime.getRuntime().totalMemory();
        System.out.println("排序前堆大小---> " + heapSize1);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return dateSort(o1, o2);
            }
        });

        long heapSize2 = Runtime.getRuntime().totalMemory();
        while (true) {
            Date date = new Date();
            if (list.size() > 100000) {
                break;
            }
        }
        System.out.println("排序后堆大小---->" + heapSize2);


        System.out.println("==================打印结果分隔符======================");
        list.forEach(n -> {
            System.out.println(n);
        });

    }
}
