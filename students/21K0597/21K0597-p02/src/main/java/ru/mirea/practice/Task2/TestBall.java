package ru.mirea.practice.Task2;

import ru.mirea.practice.Task1.Author;

import java.util.Scanner;

abstract class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the starting coordinates of the ball \n");
            ball1.setXY(sc.nextDouble(), sc.nextDouble());
            System.out.print("Enter the coordinate change \n");
            ball1.move(sc.nextDouble(), sc.nextDouble());
            sc.close();
            System.out.print(ball1.toString());
        }
    }
}