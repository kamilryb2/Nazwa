package com.company;

public class Student {
    Student(){
        System.out.println("Jestem konstruktorem bez parametrów, klasy Student");
    }

    String name;
    String lastName;

    Student(String n, String l){
        name=n;
        lastName=l;
    }


}
