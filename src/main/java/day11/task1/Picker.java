package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public boolean isPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public Picker( Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return salary + "," + isPayed() + "," + warehouse.getCountPickedOrders();
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.pickerDoWork();
    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() >= 10000) {
            salary += 70000;
            System.out.println("Сборщику начислен бонус");
        } else System.out.println("Бонус пока не доступен");
    }
}
