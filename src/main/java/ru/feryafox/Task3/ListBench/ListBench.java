package ru.feryafox.Task3.ListBench;

import de.vandermeer.asciitable.AsciiTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListBench {
    public static void doBench(Bench bench, int[] sizes, int attempts) {
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow("Размер (k)", "ArrayList", "LinkedList", "Разница", "Разница в %");
        at.addRule();

        List<Long> arrayListResults = new ArrayList<>();
        List<Long> linkedListResults = new ArrayList<>();

        for (int i : sizes) {

            for (int j = 0; j < attempts; j++) {
                arrayListResults.add(bench.run(new ArrayList<Integer>(), i));
                linkedListResults.add(bench.run(new LinkedList<Integer>(), i));

            }
            long arrayList = calcMiddle(arrayListResults);
            long linkedList = calcMiddle(linkedListResults);
            long difference = arrayList - linkedList;

            at.addRow(i, arrayList, linkedList, difference, String.format("%.2f", (double) difference / linkedList * 100));
            arrayListResults.clear();
            linkedListResults.clear();
        }

        at.addRule();

        System.out.println(at.render());
    }

    private static long calcMiddle(List<Long> results) {
        long middle = 0;

        for (Long result : results) {
            middle += result;
        }

        return middle / results.size();
    }
}
