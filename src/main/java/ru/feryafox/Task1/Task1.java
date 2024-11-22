package ru.feryafox.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] words = new String[] {
                "Яблоко",
                "Банан",
                "Клубника",
                "Яблоко",
                "Апельсин",
                "Груша",
                "Банан",
                "Персик",
                "Апельсин",
                "Груша",
                "Клубника",
                "Яблоко",
                "Банан",
                "Апельсин",
                "Груша",
                "Клубника"
        };

        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordsCount.keySet()) {
            System.out.printf("%s : %d\n", word, wordsCount.get(word));
        }
    }
}
