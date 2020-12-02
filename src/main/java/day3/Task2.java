package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        for (; ; ) {
            double a = d.nextDouble();
            double b = d.nextDouble();
            if (b == 0) {
                break;
            }
            System.out.println(a / b);
        }

    }
}
