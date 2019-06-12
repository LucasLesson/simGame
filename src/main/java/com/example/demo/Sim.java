package com.example.demo;

public class Sim {

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void changeBudget(double budget) {
        this.budget = budget;
        if(this.budget < 0){
            this.budget = 0;
        }
    }

    public double getBudget() {
        return budget;
    }

    private int age;
    private double budget;
    private String surname;
    private String firstName;


    Sim(int age, String surname, String firstName) {
        this.age = age;
        this.surname = surname;
        this.firstName = firstName;
        this.budget = 0.0d;
    }

    public String toString() {
        return "My name is : " + firstName + " " + surname + ". I'm  " + age + " years old." ;
    }
}
