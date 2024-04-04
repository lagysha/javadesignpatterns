package org.example.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();

        Iterator<String> iterator = arrList.iterator();
        iterator.hasNext();
    }
}
