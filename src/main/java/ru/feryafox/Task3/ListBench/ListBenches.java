package ru.feryafox.Task3.ListBench;

import java.util.List;
import java.util.Random;

public class ListBenches {
    public static long fillingBench(List<Integer> list, int size) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        return System.nanoTime() - startTime;
    }

    public static long addAtEnd(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.add(random.nextInt());
        }

        return System.nanoTime() - startTime;
    }

    public static long addAtStart(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.addFirst(random.nextInt());
        }

        return System.nanoTime() - startTime;
    }

    public static long addAtCenter(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.add(list.size() / 2, random.nextInt());
        }

        return System.nanoTime() - startTime;
    }

    public static long getCenter(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.get(list.size() / 2);
        }

        return System.nanoTime() - startTime;
    }

    public static long getLast(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.getLast();
        }

        return System.nanoTime() - startTime;
    }

    public static long getFirst(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.getFirst();
        }

        return System.nanoTime() - startTime;
    }

    public static long deleteEnd(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.removeLast();
        }

        return System.nanoTime() - startTime;
    }

    public static long deleteStart(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.removeFirst();
        }

        return System.nanoTime() - startTime;
    }

    public static long deleteCenter(List<Integer> list, int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < size / 10; i ++) {
            list.remove(list.size() / 2);
        }

        return System.nanoTime() - startTime;
    }
}
