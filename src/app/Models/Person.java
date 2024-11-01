package app.Models;

public class Person {
    private int id;
    public static int counter;

    public static final int NUM;

    static {
        counter = 1;
        NUM = 25;
        System.out.println("Static load");
    }

    public Person(){
        id = counter++;
        System.out.println("Constructor load");
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }

}
