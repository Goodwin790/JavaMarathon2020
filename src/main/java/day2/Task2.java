package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a; i < b; ++i) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");

            }
        }
    }
}
