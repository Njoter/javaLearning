package com.example.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        ArrayList har ingen satt størrelse
        ArrayList<String> names = new ArrayList<>();
        names.add("Stian");
        names.add("Geir");
        names.add("Jacoba");
        System.out.println(names.get(0));
        System.out.println(names.size());

//        Find index of element. if no element found, prints -1
        System.out.println(names.indexOf("Jacoba"));

//        remove element
        names.remove("Geir");
        System.out.println(names.size());
        System.out.println(names.get(1));

//        check if element is in list
        System.out.println(names.contains("Geir"));
        System.out.println(names.contains("Stian"));

//        Clear list and check if empty
        names.clear();
        System.out.println(names.isEmpty());

//        Can't use int (primitive data type), must use Integer (java class)
        ArrayList<Integer> numbers = new ArrayList<>();

//        Maps
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Stian", "stianovesen@gmail.com");
        emailList.put("Jacoba", "jacoba@gmail.com");

        System.out.println(emailList.get("Stian"));
        System.out.println(emailList.size());

        emailList.remove("Jacoba");

        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Jacoba"));
        System.out.println(emailList.containsValue("stianovesen@gmail.com"));

//        Array list with class
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Stian", 15));
        students.add(new Student("Geir", 25));

//        for each loop
        for (Student s: students) {
            System.out.println(s.getName());
        }
    }
}
