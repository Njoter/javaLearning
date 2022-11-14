package com.example.oopchallengesolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Jompa-Jarvis", 25,
                new Eye("Left Eye", "Short Sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Green", false),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", true),
                new Skin("Skin", "Burned", "White", 40));

        Scanner scanner = new Scanner(System.in);
        int answer;
        int x;

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge() + "\n");

        while (true) {
            System.out.println("Choose an organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    patient.getLeftEye().getDetails();

                    if (patient.getLeftEye().isEyeOpen()) {
                        System.out.println("\n\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        }
                    } else {
                        System.out.println("\n\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        }
                    }
                    continue;

                case 2:
                    patient.getRightEye().getDetails();

                    if (patient.getRightEye().isEyeOpen()) {
                        System.out.println("\n\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        }
                    } else {
                        System.out.println("\n\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        }
                    }
                    continue;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\n\t1. Change heart rate");

                    if (scanner.nextInt() == 1) {
                        System.out.println("Set heart rate to: ");
                        patient.getHeart().setHeartRate(scanner.nextInt());
                    }
                    continue;

                case 4:
                    patient.getStomach().getDetails();

                    if (patient.getStomach().isEmpty()) {
                        System.out.println("\n\t1. Digest");
                        if (scanner.nextInt() == 1) {
                            patient.getStomach().digest();
                            patient.getStomach().setEmpty(false);
                        }
                    }
                    continue;

                case 5:
                    patient.getSkin().getDetails();
                    continue;

                case 6:
                    return;
            }
        }
    }
}
