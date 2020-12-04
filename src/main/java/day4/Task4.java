package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0, index = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            double r = Math.random() * 10000;
            array[i] = (int) r;
            if (i > 1) {
                sum = array[i - 2] + array[i - 1] + array[i];
                if (max < sum) {
                    max = sum;
                    index = i - 2;
                }

            }
        }
        System.out.println( max);
        System.out.println(index);

    }
}
