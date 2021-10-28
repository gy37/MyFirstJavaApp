package com.company;
import java.io.*;

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
