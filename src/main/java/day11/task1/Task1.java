package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker) {
        for (int i = 0; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier( warehouse1);
        Picker picker1 = new Picker( warehouse1);
        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier( warehouse2);
        Picker picker2 = new Picker( warehouse2);
        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println(picker1);
    }
}
