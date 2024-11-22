package ru.feryafox.Task3;

import de.vandermeer.asciitable.AsciiTable;
import ru.feryafox.Task3.ListBench.ListBench;
import ru.feryafox.Task3.ListBench.ListBenches;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        int[] benchSizes = new int[] {
                10,
                100,
                1_000,
                10_000,
                100_000,
                1_000_000
        };

        int attempts = 10;

        System.out.printf("Все тесты проводятся %d раз\n\n", attempts);

        System.out.println("Заполнение");
        ListBench.doBench(ListBenches::fillingBench, benchSizes, attempts);


        System.out.println("Добавление в начало k / 10 элементов");
        ListBench.doBench(ListBenches::addAtStart, benchSizes, attempts);

        System.out.println("Добавление в середину k / 10 элементов");
        ListBench.doBench(ListBenches::addAtCenter, benchSizes, attempts);

        System.out.println("Добавление в конец k / 10 элементов");
        ListBench.doBench(ListBenches::addAtEnd, benchSizes, attempts);


        System.out.println("Получение из начала k / 10 раз");
        ListBench.doBench(ListBenches::getFirst, benchSizes, attempts);

        System.out.println("Получение из середины k / 10 раз");
        ListBench.doBench(ListBenches::getCenter, benchSizes, attempts);

        System.out.println("Получение из конца k / 10 раз");
        ListBench.doBench(ListBenches::getLast, benchSizes, attempts);


        System.out.println("Удаление из начала k / 10 раз");
        ListBench.doBench(ListBenches::deleteStart, benchSizes, attempts);

        System.out.println("Удаление из середины k / 10 раз");
        ListBench.doBench(ListBenches::deleteCenter, benchSizes, attempts);

        System.out.println("Удаление из конца k / 10 раз");
        ListBench.doBench(ListBenches::deleteEnd, benchSizes, attempts);
    }
}
