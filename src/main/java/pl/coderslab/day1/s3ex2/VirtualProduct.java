package pl.coderslab.day1.s3ex2;

public class VirtualProduct implements Product {

    private String name;
    private double value;

    public VirtualProduct(String name, double value) {
        this.setName(name);
        this.setValue(value);
    }

    @Override
    public Product setValue(double value) {
        this.value = value;
        return this;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Product setName(String name) {
        this.name = name;
        return this;
    }
}

