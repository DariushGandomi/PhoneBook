package com.sample.phonebook;

public class Contact {
    //    private fields of Contact object
    private String name;
    private String number;

    //    Constructor with its parameters, used to initialize private fields
    public Contact (String name, String number) {
        this.name = name;
        this.number = number;
    }

    //    toString method with this method we can return private fields data
    @Override
    public String toString(){
        return "-----------------------------------------\n" +
                "name: " + name + ", number: " + number;
    }
}