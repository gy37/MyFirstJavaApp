package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String content = "I am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含 'runoob' " + isMatch);

        String line = "This order was placed from QT3000! OK?";
        String pattern1 = "(\\D*)(\\d+)(.*)";
        Pattern p = Pattern.compile(pattern1);
        Matcher m = p.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

        String regex = "\\bcat\\b";
        String input = "cat cat cat cattie cat";
        Pattern pattern2 = Pattern.compile(regex);
        Matcher m2 = pattern2.matcher(input);
        int count = 0;
        while (m2.find()) {
            count ++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m2.start());
            System.out.println("end(): " + m2.end());
        }

        System.out.println(m2.matches() + " " + m2.lookingAt());

//        System.out.println(m2.replaceAll("dog"));

        StringBuffer sb = new StringBuffer();
        while (m2.find()) {
            m2.appendReplacement(sb, "aaa");
        }
        System.out.println(sb.toString());
    }
}
