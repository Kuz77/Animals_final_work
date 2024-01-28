package org.example;

class Pet extends Animal {
    private int empathyLevel;

    public Pet(String name, String birthDate, int empathyLevel) {
        super(name, birthDate);
        this.empathyLevel = empathyLevel;
    }
}
