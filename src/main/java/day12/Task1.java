package day12;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(MysqlxDatatypes.Scalar.String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("lada");
        cars.add("dodge");
        cars.add("bugatti");
        cars.add("lamborghini");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        cars.add(3, "kamaz");
        cars.remove(0);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}
