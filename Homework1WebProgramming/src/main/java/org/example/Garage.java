package org.example;
import java.util.*;
import java.util.List;

public class Garage {
    //Making the list of all
    private List<Ferrari> cars = new ArrayList<>();

    // adding a Ferrari to the garage
    public void addCar(Ferrari ferrari){
        cars.add(ferrari);
    }

    //Print out a list of cars in the garage
    public void printCars(){
        if(cars.isEmpty()){
            System.out.println("The garage is Empty");
        } else {
            System.out.println("Cars in the garage:");
            for (Ferrari f: cars){
                System.out.println("-" + f); //calls
            }
        }
    }
public List<Ferrari> getCars(){
        return cars;
}
}
