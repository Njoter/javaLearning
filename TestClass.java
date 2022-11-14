package com.example.myapplication;

import jdk.incubator.vector.VectorOperators;

public class TestClass {
    private int age;
    private String color;

//    inner classes can be private and static
    private class TestInnerClass {
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age: " + age);
        }
    }
}
