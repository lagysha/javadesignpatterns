package org.example.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        CompressionContext compressionContext = new CompressionContext(new ZipCompressionStrategy());

        List<File> files = new ArrayList<>();
        compressionContext.createArchive(files);
        compressionContext.createArchive(files, System.out::println);

        files.sort(Comparator.naturalOrder());
    }
}
