package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try (Counter counter = new Counter()) {
            Scanner scanner = new Scanner(System.in);
            Zoo zoo = new Zoo();
            boolean exit = false;
            while (!exit) {
                System.out.println("----- Меню -----");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Показать команды животного");
                System.out.println("3. Обучить животное новой команде");
                System.out.println("4. Выйти из программы");
                System.out.print("Выберите пункт меню: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                counter.add();
                switch (choice) {


//        Scanner scanner = new Scanner(System.in);
//        Zoo zoo = new Zoo();
//        boolean exit = false;
//
//        while (!exit) {
//            System.out.println("----- Меню -----");
//            System.out.println("1. Завести новое животное");
//            System.out.println("2. Показать команды животного");
//            System.out.println("3. Обучить животное новой команде");
//            System.out.println("4. Выйти из программы");
//            System.out.print("Выберите пункт меню: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {


                    case 1:
                        System.out.print("Введите тип животного (1 - Собака, 2 - Кот 3 - Хомяк 4 - Лошадь 5 - Осел 6 - Верблюд): ");
                        int animalType = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Введите имя животного: ");
                        String name = scanner.nextLine();

                        System.out.print("Введите дату рождения животного: ");
                        String birthDate = scanner.nextLine();

                        if (animalType == 1) {
                            System.out.print("Введите породу собаки: ");
                            String breed = scanner.nextLine();

                            System.out.print("Введите уровень эмпатии животного: ");
                            int empathyLevel = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Введите количество команд для собаки: ");
                            int commandCount = scanner.nextInt();
                            scanner.nextLine();

                            String[] commands = new String[commandCount];
                            for (int i = 0; i < commandCount; i++) {
                                System.out.print("Введите команду " + (i + 1) + ": ");
                                commands[i] = scanner.nextLine();
                            }
                            Animal dog = new Dog(name, birthDate, empathyLevel, breed, commands);
                            zoo.addAnimal(dog);
                            System.out.println("Собака успешно добавлена.");
                        } else if (animalType == 2) {
                            System.out.print("Введите наличие шерсти (true/false): ");
                            boolean hasFur = scanner.nextBoolean();
                            scanner.nextLine();

                            System.out.print("Введите уровень эмпатии животного: ");
                            int empathyLevel = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Введите породу кота: ");
                            String breed = scanner.nextLine();

                            Animal cat = new Cat(name, birthDate, empathyLevel, hasFur, breed);
                            zoo.addAnimal(cat);
                            System.out.println("Кот успешно добавлен.");
                        } else if (animalType == 3) {
                            System.out.print("Введите пугливость (true/false): ");
                            boolean isTimid = scanner.nextBoolean();
                            scanner.nextLine();

                            System.out.print("Введите уровень эмпатии животного: ");
                            int empathyLevel = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Введите породу хомяка: ");
                            String breed = scanner.nextLine();

                            Animal hamster = new Hamster(name, birthDate, empathyLevel, breed, isTimid);
                            zoo.addAnimal(hamster);
                            System.out.println("Хомяк успешно добавлен.");
                        } else if (animalType == 4) {
                            System.out.print("Введите грузоподъемность лошади: ");
                            int carryingCapacity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Введите скорость лошади: ");
                            int speed = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Введите породу лошади: ");
                            String breed = scanner.nextLine();
                            Animal horse = new Horse(name, birthDate, carryingCapacity, speed, breed);
                            zoo.addAnimal(horse);
                            System.out.println("Лошадь успешно добавлена.");
                        } else if (animalType == 5) {
                            System.out.print("Введите грузоподъемность ослов: ");
                            int carryingCapacity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Введите упрямость ослов (true/false): ");
                            boolean stubborn = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Введите породу ослов: ");
                            String breed = scanner.nextLine();
                            Animal donkey = new Donkey(name, birthDate, carryingCapacity, stubborn, breed);
                            zoo.addAnimal(donkey);
                            System.out.println("Осел успешно добавлен.");
                        } else if (animalType == 6) {
                            System.out.print("Введите грузоподъемность верблюда: ");
                            int carryingCapacity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Введите количество горбов верблюда: ");
                            int humpCount = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Введите породу верблюда: ");
                            String breed = scanner.nextLine();
                            Animal camel = new Camel(name, birthDate, carryingCapacity, humpCount, breed);
                            zoo.addAnimal(camel);
                            System.out.println("Верблюд успешно добавлен.");
                        } else {
                            System.out.println("Неверный тип животного.");
                        }
                        break;


                    case 2:
                        System.out.println("Список всех животных:");
                        zoo.printAnimals();

                        System.out.print("Введите имя животного, чтобы увидеть его команды: ");
                        String animalName = scanner.nextLine();

                        Animal animal = zoo.getAnimalByName(animalName);

                        if (animal != null) {
                            animal.printCommands();
                        } else {
                            System.out.println("Животное с таким именем не найдено.");
                        }
                        break;


                    case 3:
                        System.out.print("Введите имя животного, которому нужно обучить команде: ");
                        String animalNameToTeach = scanner.nextLine();

                        Animal animalToTeach = zoo.getAnimalByName(animalNameToTeach);
                        if (animalToTeach != null) {
                            System.out.print("Введите новую команду: ");
                            String newCommand = scanner.nextLine();

                            animalToTeach.teachCommands(new String[]{newCommand});
                            System.out.println("Животное успешно обучено новой команде.");
                        } else {
                            System.out.println("Животное с таким именем не найдено.");
                        }
                        break;
//                    case 4:
//                        exit = true;
//                        System.out.println("Программа завершена.");
//                        break;
//                    default:
//                        System.out.println("Неверный выбор. Попробуйте еще раз.");
//                        break;
//                }
//                System.out.println();
//            }
//            System.out.println("Всего животных: " + counter.getCount());
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//    }
//}
                    case 4:
                        exit = true;
                        System.out.println("Всего животных: " + counter.getCount());
                        System.out.println("Программа завершена.");
                        break;

                    default:
                        System.out.println("Неверный выбор. Попробуйте еще раз.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}





//        Zoo zoo = new Zoo();
//        Animal dog = new Dog("Шарик", "01/01/2020", 5, "лабрадор", new String[]{"сидеть", "лежать"});
//        Animal cat = new Cat("барсик", "02/01/2020", 3, true, "персидский");
//        Animal horse = new Horse("лошадка", "03/01/2020", 100, 30, "гнидая");
//        zoo.addAnimal(dog);
//        zoo.addAnimal(cat);
//        zoo.addAnimal(horse);
//        zoo.printAnimals();
//
//
//        System.out.println(" ");
//
//        dog.printCommands();
//        System.out.println(" ");
//        String newCommand = "бежать";
//        if (dog instanceof Dog) {
//            Dog dogObj = (Dog) dog;
//            String[] currentCommands = dogObj.getCommands();
//            String[] updatedCommands = new String[currentCommands.length + 1];
//            System.arraycopy(currentCommands, 0, updatedCommands, 0, currentCommands.length);
//            updatedCommands[currentCommands.length] = newCommand;
//            dogObj.setCommands(updatedCommands);
//        }
//        dog.printCommands();
//        System.out.println(" ");
//        cat.printCommands();

