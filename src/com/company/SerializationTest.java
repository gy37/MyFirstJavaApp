package com.company;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        EmployeeAA aa = new EmployeeAA();
        aa.name = "Reyan Ali";
        aa.address = "Phokka Kuan, Ambehta Peer";
        aa.SSN = 11122333;
        aa.number = 101;
        try {
            FileOutputStream outputStream = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream output = new ObjectOutputStream(outputStream);
            output.writeObject(aa);
            outputStream.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        EmployeeAA bb = null;
        try {
            FileInputStream inputStream = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream input = new ObjectInputStream(inputStream);
            bb = (EmployeeAA)input.readObject();
            input.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException ce) {
            System.out.println("Employee class not found");
            ce.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee ...");
        System.out.println("name " + bb.name);
        System.out.println("address " + bb.address);
        System.out.println("SSN " + bb.SSN);
    }
}

class EmployeeAA implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}