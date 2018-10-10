package com.lahey;

public class Bird extends Animal {

    public String fly(){

        return "This bird is flying";
    }

    //override  Animal.sleeps() method
    @Override
    public String sleeps() {
        return "The bird is sleeping";
    }
}
