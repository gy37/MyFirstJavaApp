package com.company;
import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    //构造起
    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesign) {
        designation = empDesign;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void  printEmployee() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}
