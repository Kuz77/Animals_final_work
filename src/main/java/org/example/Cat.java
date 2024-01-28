package org.example;

class Cat extends Pet {
    private boolean hasFur;
    private String breed;

    public Cat(String name, String dateOfBirth, int empathyLevel, boolean hasFur, String breed) {
        super(name, dateOfBirth, empathyLevel);
        this.hasFur = hasFur;
        this.breed = breed;
    }
}
