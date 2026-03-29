package org.example;
import java.util.*;

public class Millionaire {
//todo create a Garage.
        // create a Garage and put Ferrari in it.

        // print out Ferrari and make it print out sth nice (other than ee.mainor.level1.Ferrari@1c20c684)
        // add a list of cars to Garage
        // add another Ferrari to Garage
        // make Garage print out a list of cars in it
        public static void main(String[] args) {
            //Creatig a Garage
            Garage garage = new Garage();

            //Creating a Garage and put Ferrari in it
            Ferrari ferrari1 = new Ferrari();
            garage.addCar(ferrari1);

            //Creating another ferri
            Ferrari ferrari2 = new Ferrari();
            garage.addCar(ferrari2);
            System.out.println(ferrari1);
            garage.printCars();
        }
}

