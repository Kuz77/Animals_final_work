package org.example;



class Dog extends Pet {
    private String breed;
    private String[] commands;
    public Dog(String name, String birthDate, int empathyLevel, String breed, String[] commands) {
        super(name, birthDate, empathyLevel);
        this.breed = breed;
        this.commands = commands;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    @Override
    public void printCommands() {
        System.out.println("команды для " + getName() + ":");
        for (String command : commands) {
            System.out.println(command);
        }
    }

    @Override
    public void teachCommands(String[] newCommands) {
        String[] updatedCommands = new String[commands.length + newCommands.length];
        System.arraycopy(commands, 0, updatedCommands, 0, commands.length);
        System.arraycopy(newCommands, 0, updatedCommands, commands.length, newCommands.length);
        commands = updatedCommands;
    }


}
