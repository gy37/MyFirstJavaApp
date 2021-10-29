package com.company;
import java.io.*;

class Employee {
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

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        empOne.empAge(26);
        empOne.empDesignation("高级软件开发工程师");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("初级软件开发工程师");
        empTwo.empSalary(5000);
        empTwo.printEmployee();

    }
}
