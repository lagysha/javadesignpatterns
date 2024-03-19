package org.example.creational.factorymethod;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.lang.SerializationUtils;

public class ZipArchiver implements Archiver, Serializable {
    @Override
    public void archive(File directory) {
        System.out.println("Zip Archiver");
    }
}
