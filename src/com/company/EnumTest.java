package com.company;

public class EnumTest {
    enum Color {
        RED, GREEN, BLUE;
        private Color() {
            System.out.println("Constructor called for : " + this.toString());
        }
        public void colorInfo() {
            System.out.println("Universal Color");
        }
    }

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);

        Color[] colors = Color.values();
        for (Color col: colors) {
            System.out.println(col + " value " + Color.valueOf(col.toString()) + ", at index " + col.ordinal());
        }

        color.colorInfo();
    }
}
