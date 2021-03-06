package com.company;

public class AbstractionTest {
    public static void main(String[] args) {
        Salary s = new Salary("Mohtashim", "Ambehta, UP", 3, 3600.00);
        EmployeeOne e = new Salary("John", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference --");
        e.mailCheck();
    }
}

abstract class EmployeeOne {
    private String name;
    private String address;
    private int number;
    public EmployeeOne(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }
}

class Salary extends EmployeeOne {
    private double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck() {
//        super.mailCheck();
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0) {
            this.salary = salary;
        }
    }

    @Override
    public double computePay() {
//        return super.computePay();
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}