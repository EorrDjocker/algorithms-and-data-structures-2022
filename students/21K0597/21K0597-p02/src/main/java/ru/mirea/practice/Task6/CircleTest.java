package ru.mirea.practice.Task6;

abstract class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(2);
        System.out.print(circle2.length() + "\n");
        System.out.print(circle2.sqare() + "\n");
        System.out.print(circle1.equals(circle2));
    }
}
