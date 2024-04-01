package org.example.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet = new DefaultInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
    }

    @Override
    public void connectToHost(String url) {
        if(bannedSites.contains(url.toLowerCase())){
            System.out.println("Access Denied: connecting to " + url);
        }else{
            internet.connectToHost(url);
        }
    }
}
