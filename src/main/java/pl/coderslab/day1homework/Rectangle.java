package pl.coderslab.day1homework;

public class Rectangle extends Shape {

    private double a;
    private double b;
    private double circuit;
    private double area;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getCircuit() {
        return calculateCircuit();
    }

    @Override
    public void setCircuit(double circuit) {
        calculateCircuit();
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
        return "Prostokąt o bokach " + getA() + " i " + getB() + " - pole= "+ getArea() + " obwód= " + getCircuit();
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {

        return this.a*this.b;
    }

    @Override
    public double calculateCircuit() {
        return (this.a+this.b)*2.0;
    }
}
