package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(80, 120);
        IListenerCar destr = m -> {
            System.out.println("Car is dead! Count kilometers: " + m);
        };
        IListenerCar binzEnd = m -> {
            System.out.println("Benzin is not found! Count kilometers: " + m);
        };
        car.addListenerDestruct(destr);
        car.addListenerBenzin(binzEnd);
        car.run();
        car.removeListenerDestruct(destr);
        car.removeListenerBenzin(binzEnd);
    }
}
