package com.leetcode.problem.utils;


import javax.xml.bind.DatatypeConverter;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class TestTime {



    public static void main(String[] args) throws ParseException {
        final String[] parsePatterns = {"yyyy-MM-dd","yyyy年MM月dd日",
                "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy/MM/dd",
                "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy-MM-dd HH:mm:ss.SSS", "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"};
        String value = "2021-03-01 08:50:20.392";

        if(value.matches("^[-+]?([1-9]\\d*|0)$")){
            Long milleSeconds = Long.parseLong(value);
            int size = value.length();
            //对1973-03-03 17:46:39之后的时间戳秒数最少为9位，认为只有大于等于9位的才是正常的时间戳
            if (size >= 9) {
                if (size < 12) {
                    milleSeconds = milleSeconds * 1000;
                }
                System.out.println("milleSeconds" + milleSeconds);
            } else if (size == 8) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                sdf.setLenient(false);
                System.out.println(sdf.parse(value).getTime());
            } else {
                throw new RuntimeException("invalid timestamp, value:" + value);
            }
        }
        System.out.println("是数字a"+DateUtils.parseDate(value,parsePatterns).getTime());


        String time1 = "162867020439";
        if(time1.length() == 13){
            time1.substring(13 - 3);
        }

        Long time2 = Long.parseLong(time1)/ 1000;

        System.out.println("是时间啊" + DateUtil.timeStamp2Date(time2.toString(),"")+":" + time1.substring(13-3));
        System.out.println( (int) (System.currentTimeMillis() / 1000));

//        // 返回当前时间，以毫秒为单位，表示的就是当前时刻至 1970-01-01 00:00:00.000 的毫秒差值
//        System.out.println(System.currentTimeMillis()); //1628665092151
//        //返回一个时间值(系统计时器的当前值)，精确到纳秒。它是由 JVM 提供的一个时间，主要用来精确衡量两个时间段之间的时间
//        System.out.println(System.nanoTime());//15871969205500
//        long startTime = System.nanoTime();
//        //...the code being measured
//        long estimatedTime = System.nanoTime() - startTime;
//        Date date3 = new Date(1559284293556L);
//        System.out.println(date3);
//        Date date2 = new Date(System.currentTimeMillis());//参数为19701月1日以来的毫秒数
//        System.out.println(date2);
//        //创建一个SimpleDateFormat并且告知它要读取的字符串格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String dateFormat = "2019-05-31";//创建一个日期格式字符串
//        //将一个字符串转换为相应的Date对象
//        Date date = sdf.parse(dateFormat);//要先捕获异常
//        System.out.println(date);//输出这个Date对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        System.out.println(date1);
        String dateStr = sdf1.format(date1);
        System.out.println(dateStr);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");




//        //将当前系统时间转换为2012/05/14 17:05:22的效果
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//        dateStr=format1.format(date1);
//        System.out.println(dateStr);
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//        java.sql.Timestamp timestamp = new java.sql.Timestamp(1606103751000L);
//        System.out.println("是时间呀:"+timestamp);
//        timestamp.setNanos(123456);
//        int nanos = timestamp.getNanos(); // nanos = 123456
//        Long milleSeconds = Long.parseLong(value);
//        java.sql.Timestamp thtime = new java.sql.Timestamp(milleSeconds);
//        System.out.println(thtime);
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        String dateStr3 = sdf2.format(milleSeconds);
//        System.out.println("是这个时间呀" + dateStr3);

    }





}
