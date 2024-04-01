package org.example.behavioral.strategy;

import java.io.File;
import java.util.List;

@FunctionalInterface
public interface CompressionStrategy {
    void compressFile(List<File> files);
}
