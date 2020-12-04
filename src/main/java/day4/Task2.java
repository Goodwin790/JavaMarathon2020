package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int min = 100, max = 0, num0 = 0, sum0 = 0;
        for (int i = 0; i < array.length; i++) {
            double random = (int) (Math.random() * 100);

            array[i] = (int) random;
            System.out.println(array[i]);

        }
        for (int x : array) {
            if (min > array[x]) {
                min = array[x];

            }
            if (max < array[x]) {
                max = array[x];
            }
            if (x % 10 == 0) {
                num0++;
                sum0 += x;
            }

        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Число элементов массива,оканчивающихся на 0: " + num0);
        System.out.println("Сумма элементов массива,оканчивающихся на 0 : " + sum0);
    }
}
