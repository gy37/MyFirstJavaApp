package com.company;

public class VariableTypeTest {
    String string = "hello world";//实例变量
    static int allClicks = 0;//类变量
    public String name;
    private double count;
    private  static double newCount;
    public static final String DEPARTMENT = "静态变量";

    public VariableTypeTest(String variableName) {
        name = variableName;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public void printVariable() {
        System.out.println("名字：" + name);
        System.out.println("数量：" + count);
    }

    public void method() {
        int a = 0;//局部变量
    }

    public void pupAge() {
        int age = 0;//java: variable age might not have been initialized
        age = age + 7;
        System.out.println("小狗的年龄是：" + age);
    }

    public static void main(String[] args) {
        VariableTypeTest test = new VariableTypeTest("RUNOOB");
        test.pupAge();
        test.setCount(10);
        test.printVariable();

        System.out.println(DEPARTMENT + "新数量：" + newCount);
    }
}
