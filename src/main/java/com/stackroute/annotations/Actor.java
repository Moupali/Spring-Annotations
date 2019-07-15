package com.stackroute.annotations;

public class Actor {

    private String Name;
    private String Gender;
    private int age;

    public Actor() {
    }

    public Actor(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        this.age = age;
    }

    //    public void setName(String name) {
//        Name = name;
//    }
//
//    public void setGender(String gender) {
//        Gender = gender;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
   /* public void act()
    {
        System.out.println(this.Name+" is an actor");
    }*/

    public void act() {
        System.out.println("Acting");


    }
}