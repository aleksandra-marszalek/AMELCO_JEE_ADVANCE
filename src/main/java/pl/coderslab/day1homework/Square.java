package pl.coderslab.day1homework;

public class Square extends Shape {

    private double a;
    private double area;
    private double circuit;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
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
        return "Kwadrat o boku " + getA() + " - pole= "+ getArea() + " obwód= " + getCircuit();
    }

    @Override
    public double getCircuit() {
        return calculateCircuit();
    }

    @Override
    public void setCircuit(double circuit) {
        calculateCircuit();
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return this.a*this.a;
    }

    @Override
    public double calculateCircuit() {
         return 4.0*this.a;
    }
}
