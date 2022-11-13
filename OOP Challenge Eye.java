package com.example.oopchallenge;

public class Eye extends Organ {

    private String color;
    private boolean eyeOpen;

    public Eye(String name, String medicalCondition, String color, boolean eyeOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.eyeOpen = eyeOpen;
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
