package pl.coderslab.day1;


import coderslab.day1.s3ex3.AtmApi;
import coderslab.day1.s3ex2.AdvancedProduct;
import coderslab.day1.s3ex2.ProductFactory;
import coderslab.day1.s3ex2.SimpleProduct;
import coderslab.day1.s3ex2.VirtualProduct;

public class UrlMain {

    public static void main(String[] args) {

        StandardUrl su1 = new StandardUrl();
        StandardUrl su2 = new StandardUrl();

        System.out.println(su1.getParam("param1","http://wp.pl?param2=hello&param1=catch1"));
        System.out.println(su1.getParam("param1","http://wp.pl?param2=hello&param1=catch2"));
        System.out.println(su2.getParam("param1","http://wp.pl?param2=hello&param1=catch3"));

        ExtendedUrl eu1 = new ExtendedUrl();

        System.out.println(eu1.getParam("param1", "http://url_example/param1.99/param2.string"));
        System.out.println(eu1.getParam("param2", "http://url_example/param1.99/param2.string"));

        ProductFactory productFactory = new ProductFactory();
        SimpleProduct simpleProduct = (SimpleProduct) productFactory.create("simple", "test", 20.00);
        AdvancedProduct advancedProduct = (AdvancedProduct) productFactory.create("advanced", "test", 20.00);
        VirtualProduct virtualProduct = (VirtualProduct) productFactory.create("virtual", "test", 20.00);

        System.out.println(simpleProduct.getName());
        System.out.println(advancedProduct.getName());
        System.out.println(virtualProduct.getName());

        AtmApi atmApi = new AtmApi();
        atmApi.deposit();
        atmApi.payOut();


    }
}