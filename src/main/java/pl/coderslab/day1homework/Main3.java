package pl.coderslab.day1homework;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        Square square = new Square(5.0);
        Circle circle = new Circle(5.0);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(square);
        shapeList.add(circle);

        for (Shape s: shapeList
             ) {
            System.out.println(s.toString());
        }






    }
}
