package pl.coderslab.day1homework;

public class Circle extends Shape {

    private double r;
    private double area;
    private double circuit;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    @Override
    public void setArea(double area) {
        calculateArea();
    }

    @Override
    public String toString() {
        return "Koło o promieniu " + getR() + " - pole= "+ getArea() + " obwód= " + getCircuit();
    }

    @Override
    public double getCircuit() {
        return calculateCircuit();
    }

    @Override
    public void setCircuit(double circuit) {
        calculateCircuit();
    }

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return this.r*this.r*Math.PI;
    }

    @Override
    public double calculateCircuit() {
        return 2*Math.PI*this.r;
    }
}
