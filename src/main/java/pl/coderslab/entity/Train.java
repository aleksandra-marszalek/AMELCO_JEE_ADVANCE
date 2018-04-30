package pl.coderslab.entity;

public class Train extends Vehicle {

    public int trackWidth;

    public Train(String model, Integer maxSpeed, int trackWidth) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.setTrackWidth(trackWidth);
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }
}
