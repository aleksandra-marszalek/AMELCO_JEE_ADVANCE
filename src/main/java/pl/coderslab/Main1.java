package pl.coderslab;


import pl.coderslab.day2homework.Inspectionable;
import pl.coderslab.entity.Car;
import pl.coderslab.entity.Train;
import pl.coderslab.entity.Vehicle;

import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];

        Car car = new Car("mazda", 200, "rx300");
        Train train = new Train("EP07", 160, 1435);
        Car car2 = new Car("mercedes", 290, "c-class");
        Train train2 = new Train("pendolino", 220, 1435);

        vehicles[0] = car;
        vehicles[1] = train;
        vehicles[2] = car2;
        vehicles[3] = train2;



//        for (Vehicle v : vehicles) {
//
//            System.out.println(v.toString());
//
//        }



        printAll(vehicles);


    }

    // nowa metoda która printuje wszystkie obiekty vehicle i, jeśli dany obiekt implementuje inspectionable -
    // wykonuje metode createInspection
    static void printAll(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Inspectionable) {
                ((Inspectionable) vehicle).createInspection();
            }

            System.out.println(vehicle.toString());
        }

    }
}
