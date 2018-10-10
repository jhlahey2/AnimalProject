package com.lahey;

public class Animal {

    //default constructor
    public Animal() {

            System.out.println("This is the constructor.");
    }

    //overloaded donstructor
    public Animal(String value){
        this.animalName = value;
        System.out.println("Overloaded Constructor");
    }

    //name
    private String animalName = "";
    //get name
    public String getAnimalName() {
        return animalName;
    }

    //set name
    public void setAnimalName(String animalName) {

        //set 1st char upper case && ther rest lower casse
        this.animalName = animalName;
    }

    //sleep
    public String sleeps() {
        return "An animal sleeps...";
    }

    //eat
    public String eats(){

        return "An animal eats...";
    }

    //thinking
    private String thoughts(){

        return "An animal eats...";
    }

    public String myThoughts(){

        return thoughts();
    }

}//end public class Animal
