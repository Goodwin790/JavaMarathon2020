package day11.task1;

public class Warehouse  {
    private int countPickedOrders ;
    private int countDeliveredOrders ;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void pickerDoWork() {
        countPickedOrders++;
    }
    public void courierDoWork(){
        countDeliveredOrders ++;
    }

    @Override
    public String toString() {
        return countPickedOrders + "," + countDeliveredOrders;
    }

    public Warehouse() {
        super();
    }

}
