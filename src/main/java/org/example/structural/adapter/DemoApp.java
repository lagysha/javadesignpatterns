package org.example.structural.adapter;

import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        Sorter sorter = new SortListAdapter();

        int[] numbers = {1,3,2};
        numbers = sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
