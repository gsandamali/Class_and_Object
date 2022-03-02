package com.company;

public class Main {

    public static void main(String[] args) {
        Student mark = new Student();

        mark.id = 1;
        mark.name = "Mark" ;
        mark.age = 15;

        System.out.println(mark.name + " is " + mark.age + " years old");


        mark.setPassword("a2gbg");
        System.out.println("Password is " + mark.getPassword());
    }
}
