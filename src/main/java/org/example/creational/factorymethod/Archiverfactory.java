package org.example.creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class Archiverfactory {
    private static Map<String, Supplier<Archiver>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("zip", ZipArchiver::new);
        typeConstructorMap.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String archiverType){
        return Optional.ofNullable(typeConstructorMap.get(archiverType))
            .orElse(() -> null).get();
    }
}
