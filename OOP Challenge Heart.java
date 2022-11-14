package com.example.oopchallengesolution;

public class Heart extends Organ {
    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate is: " + this.getHeartRate());
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        System.out.println("Heart rate changed to " + this.getHeartRate());
    }
}
