package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public boolean isPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public Courier( Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        this.salary += 100;
        warehouse.courierDoWork();
    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() >= 10000) {
            salary += 50000;
            System.out.println("Курьеру начислен бонус");
        } else System.out.println("Бонус пока не доступен");
    }

    @Override
    public String toString() {
        return salary + "," + isPayed() + "," + warehouse.getCountDeliveredOrders();
    }
}
