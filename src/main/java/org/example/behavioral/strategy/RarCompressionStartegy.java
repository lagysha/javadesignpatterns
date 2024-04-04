package org.example.behavioral.strategy;

import java.io.File;
import java.util.List;

public class RarCompressionStartegy implements CompressionStrategy{
    @Override
    public void compressFile(List<File> files) {
        System.out.println("Rar compression");
    }
}
