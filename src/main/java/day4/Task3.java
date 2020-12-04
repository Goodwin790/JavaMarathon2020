package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8, sum = 0, max = 0, index = 0;
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                double random = Math.random() * 50;
                array[i][j] = (int) random;
                sum += array[i][j];
                if (sum >= max) {
                    max = sum;
                    index = i;
                }
            }

        }
        System.out.println("Ответ: " + index);

    }
}
