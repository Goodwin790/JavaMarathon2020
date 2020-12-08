package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boeing", 1997, 1766, 2000);
        airplane.setLength(2123);
        airplane.setYear(2003);
        airplane.fillUp(100);
        airplane.fillUp(400);
        airplane.info();
    }
}
