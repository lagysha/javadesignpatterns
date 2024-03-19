package org.example.creational.builder.chain;

public class DemoApp {
    public static void main(String[] args) {
        Account account = Account
            .newBuilder()
            .setToken("hello")
            .setUserId("hollo")
            .build();
        System.out.println(account);
    }
}
