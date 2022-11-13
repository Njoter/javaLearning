package com.example.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Eye leftEye = new Eye("Left Eye", "Short sighted", "Blue", true);
        Eye rightEye = new Eye("Right Eye", "Normal", "Blue", true);
        Heart heart = new Heart("Heart", "Normal", 65);
        Organ stomach = new Organ("Stomach", "PUD");
        Organ skin = new Organ("Skin", "Burned");

        System.out.println("Name: Bob");
        System.out.println("Age: 32");

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        while (true) {
//        prompt for organ
            System.out.println("Choose an organ: ");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            x = scanner.nextInt();

//             1. Left Eye
            if (x == 1) {
                System.out.println("Name: " + leftEye.getName());
                System.out.println("Medical Condition: " + leftEye.getMedicalCondition());
                System.out.println("Color: " + leftEye.getColor());

//                open or close left eye
                if (leftEye.isEyeOpen()) {
                    System.out.println("\t1. Close the Eye");
                    y = scanner.nextInt();
                    if (y == 1) {
                        leftEye.setEyeOpen(false);
                        System.out.println("Left Eye Closed");
                    }
                } else if (!leftEye.isEyeOpen()) {
                    System.out.println("\t1. Open the Eye");
                    y = scanner.nextInt();
                    if (y == 1) {
                        leftEye.setEyeOpen(true);
                        System.out.println("Left Eye Opened");
                    }
                }

//              2. right eye
            } else if (x == 2) {
                System.out.println("Name: " + rightEye.getName());
                System.out.println("Medical Condition: " + rightEye.getMedicalCondition());
                System.out.println("Color: " + rightEye.getColor());

//                open or close right eye
                if (rightEye.isEyeOpen()) {
                    System.out.println("\t1. Close the Eye");
                    y = scanner.nextInt();
                    if (y == 1) {
                        rightEye.setEyeOpen(false);
                        System.out.println("Right Eye Closed");
                    }
                } else if (!rightEye.isEyeOpen()) {
                    System.out.println("1. Open the Eye");
                    y = scanner.nextInt();
                    if (y == 1) {
                        rightEye.setEyeOpen(true);
                        System.out.println("Right Eye Opened");
                    }
                }

//              3. Heart
            } else if (x == 3) {
                System.out.println("Name: " + heart.getName());
                System.out.println("Medical Condition: " + heart.getMedicalCondition());
                System.out.println("Heart rate: " + heart.getHeartRate());
                System.out.println("\t1. Change the heart rate");
                y = scanner.nextInt();

                if (y == 1) {
                    System.out.println("Enter the new heart rate");
                    heart.setHeartRate(scanner.nextInt());
                    System.out.println("Heart rate changed to: " + heart.getHeartRate());
                }

//              4. Stomach
            } else if (x == 4) {
                System.out.println("Name: " + stomach.getName());
                System.out.println("Medical Condition: " + stomach.getMedicalCondition());
                System.out.println("Need to be fed");
                System.out.println("\t1. Digest");
                y = scanner.nextInt();

                if (y == 1) {
                    System.out.println("Digesting begin...");
                }

//              5. Skin
            } else if (x == 5) {
                System.out.println("Name: " + skin.getName());
                System.out.println("Medical Condition: " + skin.getMedicalCondition());

//              6. Quit
            } else if (x == 6) {
                return;
            }
        }

    }
}
