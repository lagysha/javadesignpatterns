package org.example.structural.adapter;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortListAdapter implements Sorter{

    private NumberSorter numberSorter;

    public SortListAdapter() {
        numberSorter = new NumberSorter();
    }

    @Override
    public int[] sort(int[] numbers) {
        List<Integer> integers = IntStream.of(numbers).boxed().collect(Collectors.toList());
        numberSorter.sortList(integers);
        return integers.stream().mapToInt(i->i).toArray();
    }
}
