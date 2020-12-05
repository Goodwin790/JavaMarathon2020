package day5;

public class Motorbike {
    private String model;
    private int year;
    private String color;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Motorbike(String model, int year, String color) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public Motorbike(String color, String model, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
}
