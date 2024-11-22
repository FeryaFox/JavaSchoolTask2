package ru.feryafox.Task2;

public class Task2 {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("Иванов", "+7 999 999 99 99");
        telephoneDirectory.add("Иванов", "+7 999 999 99 88");
        telephoneDirectory.add("Петров", "+7 999 999 99 77");
        telephoneDirectory.add("Сидоров", "+7 999 999 99 66");
        System.out.print("Номера телефона Иванова: ");
        for (String number : telephoneDirectory.get("Иванов")) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Номера телефона Петрова: ");
        for (String number : telephoneDirectory.get("Петров")) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Номера телефона Гранкова: ");
        for (String number : telephoneDirectory.get("Гранков")) {
            System.out.print(number + " ");
        }
    }
}
