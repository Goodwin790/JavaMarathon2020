package day6;

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

    public void info() {
        System.out.println("Это мотоцикл");

    }

    public int yearDifference(int year) {
        int result =  this.year - year;
        return result;

    }
}