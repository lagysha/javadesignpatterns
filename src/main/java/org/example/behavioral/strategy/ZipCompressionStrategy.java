package org.example.behavioral.strategy;

import java.io.File;
import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy{
    @Override
    public void compressFile(List<File> files) {
        System.out.println("Zip compression");
    }
}
