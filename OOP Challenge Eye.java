package com.example.oopchallengesolution;

public class Eye extends Organ {

    private String color;
    private boolean eyeOpen;

    public Eye(String name, String medicalCondition, String color, boolean eyeOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.eyeOpen = eyeOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void open() {
        this.setEyeOpen(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close() {
        this.setEyeOpen(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return color;
    }

    public boolean isEyeOpen() {
        return eyeOpen;
    }

    public void setEyeOpen(boolean eyeOpen) {
        this.eyeOpen = eyeOpen;
    }
}
