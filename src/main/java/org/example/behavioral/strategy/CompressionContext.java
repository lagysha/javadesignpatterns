package org.example.behavioral.strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void createArchive(List<File> files){
        compressionStrategy.compressFile(files);
    }

    public void createArchive(List<File> files,CompressionStrategy compressionStrategy){
        compressionStrategy.compressFile(files);
    }
}
