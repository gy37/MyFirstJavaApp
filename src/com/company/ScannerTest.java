package com.company;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");
//        if (scan.hasNext()) {
//            String str = scan.next();
//            System.out.println("输入的数据为：" + str);
//        }
//        if (scan.hasNextLine()) {
//            String str = scan.nextLine();
//            System.out.println("输入的数据为：" + str);
//        }

        double sum = 0;
        int m = 0;
        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为：" + sum);
        System.out.println(m + "个数的平均值是：" + sum / m);
        scan.close();
    }
}
