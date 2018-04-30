package pl.coderslab.day1homework;

public abstract class Shape {
    private double area;
    private double circuit;
    private String color;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        calculateArea();
    }

    @Override
    public abstract String toString();

    public double getCircuit() {
        return circuit;
    }

    public void setCircuit(double circuit) {
        calculateCircuit();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculateCircuit();

}
