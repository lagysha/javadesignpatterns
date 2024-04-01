package org.example.structural.proxy;

public class DemoApp {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectToHost("facebook.com");
        internet.connectToHost("facebook1.com");
    }
}
