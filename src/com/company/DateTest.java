package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为：" + sdf.format(date));

        System.out.printf("全部日期和时间信息：%tc%n", date);

        try {
            System.out.println(sdf.parse("2020-02-02 20:20:20"));
            Thread.sleep(1 * 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程休眠");

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 10);
        System.out.println(calendar.get(Calendar.DATE));
    }
}
