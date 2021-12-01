package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOTest {
    public static void main(String[] args) throws IOException {
        char c;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符，按下 'q' 键推出。");
        System.out.println("输入字符串，输入 'end' 键推出。");
//        do {
////            c = (char) br.read();
////            System.out.println(c);
//            str = br.readLine();
//            System.out.println(str);
//        } while (!str.equals("end"));//c != 'q'

        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');

        byte bWrite[] = { 11, 21, 3, 40, 5 };
        OutputStream os = new FileOutputStream("test.text");
        for (int x = 0; x < bWrite.length; x ++) {
            os.write(bWrite[x]);
        }
        os.close();
        InputStream is = new FileInputStream("test.text");
        int size = is.available();
        for (int i = 0; i < size; i ++) {
            System.out.print((char)is.read() + "  ");
        }
        is.close();

        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

        String dirName = "/Users/gaoshenyu/Desktop/test";
        File dir = new File(dirName);
        dir.mkdirs();

        printAllFiles(dirName);
    }

    public static void printAllFiles(String dirName) {
        File f = new File(dirName);
        if (f.isDirectory()) {
            System.out.println(dirName + " 是一个目录");
            String s[] = f.list();
            for (int i = 0; i < s.length; i ++) {
                printAllFiles(dirName + "/" + s[i]);
            }
        } else {
            System.out.println(dirName + " 是一个文件");
        }
    }
}
