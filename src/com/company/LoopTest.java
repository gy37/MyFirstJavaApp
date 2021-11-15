package com.company;

public class LoopTest {
    public static void main(String[] args) {
        int x = 10, y = 20;
        while (x < 20) {
            System.out.print("value of x: " + x);
            x++;
            System.out.print("\n");
        }

        do {
            System.out.print("value of y: " + y);
            y++;
            System.out.print("\n");
        } while (y < 30);

        for (int z = 30; z < 40; z++) {
            System.out.print("value of z: " + z);
            System.out.print("\n");
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for (int a: numbers) {
            System.out.println("aaa: " + a);
        }
    }
}
