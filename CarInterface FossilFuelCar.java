package com.example.interfacesandabstractclasses;

public class FossilFuelCar implements CarInterface {

    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public void getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in cylinder caused the engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + " mph");
    }
}
