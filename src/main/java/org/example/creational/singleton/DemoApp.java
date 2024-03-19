package org.example.creational.singleton;

public class DemoApp {
    public static void main(String[] args) {
        var instance1 = OrderManagementService.getInstance();
        var instance2 = OrderManagementService.getInstance();

        System.out.println(instance1 == instance2);

        instance1.placeOrder();
    }
}
