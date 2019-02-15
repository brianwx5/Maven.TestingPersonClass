package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name  = "";
    private int age = Integer.MAX_VALUE;
    private String lastName = "";
    private String ethnicity = "";
    private char Orientation = ' ';
    private boolean haveHair = false;
    private Double heightInFeet;


    public Person() {

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public char getOrientation() {
        return Orientation;
    }

    public void setOrientation(char orientation) {
        Orientation = orientation;
    }

    public boolean getHaveHair() {
        return haveHair;
    }

    public void setHaveHair(boolean haveHair) {
        this.haveHair = haveHair;
    }

    public Double getHeightInFeet() {
        return heightInFeet;
    }

    public void setHeightInFeet(Double heightInFeet) {
        this.heightInFeet = heightInFeet;
    }
}
