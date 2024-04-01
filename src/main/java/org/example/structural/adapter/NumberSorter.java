package org.example.structural.adapter;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Third-party implementation that we need to adapt
public class NumberSorter {
    public List<Integer> sortList(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }
}
