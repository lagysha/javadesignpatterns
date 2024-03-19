package org.example.creational.factorymethod;

import java.io.File;

public class DemoApp {
    public static void main(String[] args) {
        String archiverType1 = "zip";
        String archiverType2 = "rar";

        Archiver zipArchiver1 = Archiverfactory.getArchiver(archiverType1);
        Archiver zipArchiver2 = Archiverfactory.getArchiver(archiverType2);
        Archiver zipArchiver3 = Archiverfactory.getArchiver(archiverType1);

        zipArchiver1.archive(new File(""));
        zipArchiver2.archive(new File(""));

        System.out.println(zipArchiver1 == zipArchiver3);
    }
}
