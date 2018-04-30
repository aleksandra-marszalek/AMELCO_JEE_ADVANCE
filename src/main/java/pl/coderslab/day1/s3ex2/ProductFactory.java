package pl.coderslab.day1.s3ex2;

public class ProductFactory implements ProductCreator {


    public ProductFactory() {}

    public Product create(String productType, String name, double value) {


        switch (productType) {
            case "advanced":
                return new AdvancedProduct(name, value);
            case "virtual":
                return new VirtualProduct(name, value);
            case "simple":
                default:
                    return new SimpleProduct(name, value);
        }
    }
}
