package pl.coderslab.entity;

import coderslab.day2homework.Inspectionable;

public class Car extends Vehicle implements Inspectionable {
    public String type;

    public Car(String model, Integer maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void createInspection() {
        System.out.println("Model " + this.model + " - sprawdzony");
    }
}
