package ru.feryafox.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TelephoneDirectory {
    private final HashMap<String, ArrayList<String>> telephones = new HashMap<>();

    public List<String> get(String surname) {
       return (ArrayList<String>) telephones.getOrDefault(surname, new ArrayList<>()).clone();
    }

    public void add(String surname, String number) {
        ArrayList<String> numbers = telephones.getOrDefault(surname, new ArrayList<>());
        numbers.add(number);
        telephones.put(surname, numbers);
    }
}
