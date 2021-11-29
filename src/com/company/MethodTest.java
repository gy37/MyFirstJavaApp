package com.company;

public class MethodTest {
    public static void main(String[] args) {
        int i = 5, j = 3;
        double score = 77;
        System.out.println(i + " 和 " + j + " 比较，最大值是：" + max(i , j));
        System.out.println(score + " 对应的等级是：" + getGrade(score));
        System.out.println("交换前的值为：" + i + j);
        swap(i, j);
        System.out.println("交换后的值为：" + i + j);

        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        c1 = c2 = null;
        System.gc();
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

    public static char getGrade(double score) {
        if (score >= 90.0) {
            return 'A';
        } else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70.0) {
            return 'C';
        } else if (score >= 60.0) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

}

class Cake {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}
