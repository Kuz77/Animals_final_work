package org.example;

class Pet extends Animal {
    private int empathyLevel;

    public Pet(String name, String dateOfBirth, int empathyLevel) {
        super(name, dateOfBirth);
        this.empathyLevel = empathyLevel;
    }
}
