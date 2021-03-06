package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static <E> void printArray(E[] inputArray) {
        for (E element: inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void getData(List<?> data) {
        System.out.println("data：" + data.get(0));
    }
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data：" + data.get(0));
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("整型数组为：");
        printArray(intArray);
        System.out.println("双精度数组为：");
        printArray(doubleArray);
        System.out.println("字符型数组为：");
        printArray(charArray);

        System.out.printf("%d, %d 和 %d 中最大的数为 %d \n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f \n", 6.6, 7.7, 8.8, maximum(6.6, 7.7, 8.8));
        System.out.printf("%s, %s 和 %s 中最大的数为 %s \n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));

        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        integerBox.add(10);
        stringBox.add("菜鸟教程");
        System.out.printf("整型值为：%d\n", integerBox.get());
        System.out.printf("字符串为：%s\n", stringBox.get());

        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        name.add("icon");
        age.add(18);
        getData(name);
//        getUperNumber(name);
        getData(age);
        getUperNumber(age);
    }
}

class Box<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}
