package com.company;

public class InheritanceTest {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("penguin", 123);
//        Penguin penguin = new Penguin();
        penguin.introduction();
        penguin.eat();
        penguin.sleep();

        Mouse mouse = new Mouse("mouse", 456);
//        Mouse mouse = new Mouse();
        mouse.introduction();
        mouse.eat();
        mouse.sleep();
    }
}

class Animal {
    private String name;
    private int id;
    public Animal() {
        name = "Animal";
        id = 0;
    }
    public Animal(String myName, int myId) {
        name = myName;
        id = myId;
    }
    public void eat() {
        System.out.println(name + " eating");
    }
    public void sleep() {
        System.out.println(name + " sleeping");
    }
    public void introduction() {
        System.out.println("Hi, I am " + name + ", id is " + id );
    }
}

class Penguin extends Animal {
    public Penguin() {
        System.out.println("Penguin");
    }
    public Penguin(String myName, int myId) {
        super(myName, myId);
    }

    @Override
    public void eat() {
        super.eat();
    }
}

class Mouse extends Animal {
    public Mouse() {
        super("MOUSE", 400);
    }
    public Mouse(String myName, int myId) {
//        super(myName, myId);
        System.out.println(myName + " " + myId);
    }
}