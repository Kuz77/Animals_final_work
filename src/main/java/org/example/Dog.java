package org.example;

class Dog extends Pet {
    private String breed;
    private String[] commands;

    public Dog(String name, String dateOfBirth, int empathyLevel, String breed, String[] commands) {
        super(name, dateOfBirth, empathyLevel);
        this.breed = breed;
        this.commands = commands;
    }
}
