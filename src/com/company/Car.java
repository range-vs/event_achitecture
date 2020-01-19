package com.company;

import java.util.ArrayList;

public class Car {

    private int countKilometers;
    private int countBenzin;
    private ArrayList<IListenerCar> listenerDestructs;
    private ArrayList<IListenerCar> listenerBenzin;

    public Car() {
        this.listenerDestructs = new ArrayList<>();
        this.listenerBenzin = new ArrayList<>();
    }

    public Car(int countKilometers, int countBenzin) {
        this.countKilometers = countKilometers;
        this.countBenzin = countBenzin;
        this.listenerDestructs = new ArrayList<>();
        this.listenerBenzin = new ArrayList<>();
    }

    public void run(){
        for(int i = 1; i <= countKilometers; i++){
            countBenzin--;
            if(i + 1 == 30){
                for(IListenerCar ls: listenerDestructs){
                    ls.showMessage(i);
                }
                return;
            }
            if(countBenzin == 0){
                for(IListenerCar ls: listenerBenzin){
                    ls.showMessage(i);
                }
                return;
            }
            System.out.println("Count kilometers: " + i + "\nCount benzin: " + countBenzin);
        }
    }

    public int getCountKilometers() {
        return countKilometers;
    }

    public void setCountKilometers(int countKilometers) {
        this.countKilometers = countKilometers;
    }

    public int getCountBenzin() {
        return countBenzin;
    }

    public void setCountBenzin(int countBenzin) {
        this.countBenzin = countBenzin;
    }

    public void addListenerDestruct(IListenerCar ls){
        listenerDestructs.add(ls);
    }

    public void removeListenerDestruct(IListenerCar ls){
        listenerDestructs.remove(ls);
    }

    public void addListenerBenzin(IListenerCar ls){
        listenerBenzin.add(ls);
    }

    public void removeListenerBenzin(IListenerCar ls){
        listenerBenzin.remove(ls);
    }
}
