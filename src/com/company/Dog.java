package com.company;

public class Dog {
    String breed;
    int size;
    String colour;
    int age;

    public Dog() {//构造方法

    }
    public Dog(String name) {
        //这个构造器只有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("tommy");
        System.out.println("小狗：" + String.valueOf(dog));
        dog.setDogAge(2);
        dog.getDogAge();
        System.out.println("变量值：" + dog.age);
    }

    void eat() {

    }

    void run() {

    }

    void sleep() {

    }

    void name() {

    }

    public void setDogAge(int dogAge) {
        age = dogAge;
    }

    public int getDogAge() {
        System.out.println("小狗的年龄为：" + age);
        return age;
    }
}
