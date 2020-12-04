package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int n8 = 0, n1 = 0, even = 0, uneven = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            double random = (int) (Math.random() * 10);
            sum += random;
            array[i] = (int) random;
            if (array[i] > 8) {
                n8++;
            } else if (array[i] == 1) {
                n1++;
            } else if (array[i] % 2 == 0) {
                even++;
            } else if (array[i] % 2 != 0) {
                uneven++;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + n8);
        System.out.println("Количество чисел равных 1: " + n1);
        System.out.println("Количество чётных чисел: " + even);
        System.out.println("Количество нечётных чисел: " + uneven);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
