package pl.coderslab.entity;

abstract public class Vehicle {
    public Integer maxSpeed;
    public String model;

    @Override
    public String toString() {
        return this.model + ": " + this.maxSpeed.toString();
    }
}


