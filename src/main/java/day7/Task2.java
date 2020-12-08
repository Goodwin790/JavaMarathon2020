package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        Player p1 = new Player(i);
        Player p2 = new Player(i);
        Player p3 = new Player(i);
        Player p4 = new Player(i);
        Player p5 = new Player(i);
        Player p6 = new Player(i);
        Player p7 = new Player(i);
        Player p8 = new Player(i);

        System.out.println(p2.getStamina());
        p1.info();
        for (int j = 0; j < 100; j++) {
            p1.run();

            System.out.println(p1.getStamina());

            Player.info();
        }

    }
}
