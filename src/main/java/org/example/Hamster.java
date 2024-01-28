package org.example;

class Hamster extends Pet {
    private String breed;
    private boolean isNervous;

    public Hamster(String name, String dateOfBirth, int empathyLevel, String breed, boolean isNervous) {
        super(name, dateOfBirth, empathyLevel);
        this.breed = breed;
        this.isNervous = isNervous;
    }
}