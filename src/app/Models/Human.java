package app.Models;

import app.enumHelper.Gender;

public class Human {
    //name, gender, age
    //constructor all parameters
    //getter, setter
    //method to string
    private String name;
    private Gender gender;
    private int age;

    public Human(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender.toString().toLowerCase() +
                ", age=" + age +
                '}';
    }
}
