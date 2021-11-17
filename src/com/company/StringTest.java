package com.company;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Runoob";
        String str2 = new String("Runoob");
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b' };
        String str3 = new String(helloArray);
        System.out.println(str3 + str3.length());
        System.out.println(str1.concat(str2));
        System.out.printf("%f, %d, %s", 9.8, 10, "abc");

        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(6, 8);
        System.out.println(sb);
    }
}
