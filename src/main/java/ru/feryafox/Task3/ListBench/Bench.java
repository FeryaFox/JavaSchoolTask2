package ru.feryafox.Task3.ListBench;

import java.util.List;

@FunctionalInterface
public interface Bench {
    long run(List<Integer> list, int size);
}