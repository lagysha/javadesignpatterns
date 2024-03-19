package org.example.creational.prototype;

import java.io.File;

public class DemoApp {
    public static void main(String[] args) {
        String archiverType1 = "zip";
        String archiverType2 = "rar";

        Archiver zipArchiver1 = Archiverfactory.getPrototypeForType(archiverType1);
        Archiver zipArchiver2 = Archiverfactory.getPrototypeForType(archiverType2);

        zipArchiver1.archive(new File(""));
        zipArchiver2.archive(new File(""));
    }
}
