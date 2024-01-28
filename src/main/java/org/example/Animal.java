package org.example;

class Animal {

    private String name;
    private String birthDate;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }



    public void printCommands() {
        System.out.println("животное не умеет в команды");
    }


    public void teachCommands(String[] newCommands) {
        System.out.println("это животное необучаемо");
    }



}
