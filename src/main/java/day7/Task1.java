package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2001, 55, 7000);
        Airplane airplane2 = new Airplane("Ил", 1997, 120, 3000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}