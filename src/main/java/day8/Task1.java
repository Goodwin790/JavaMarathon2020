package day8;

import org.w3c.dom.ls.LSOutput;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        String s = " ";
//        for (int i = 0; i <= 20000; i++) {
//            s = s + i + " ";
//        }
//        System.out.println(s);



        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }

}
