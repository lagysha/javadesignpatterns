package org.example.creational.singleton;

public class OrderManagementService {

    private static volatile OrderManagementService instance;

    private OrderManagementService(){}

    public static OrderManagementService getInstance() {

        if(instance == null){
            synchronized(OrderManagementService.class) {
                if(instance == null) {
                    instance = new OrderManagementService();
                }
            }
        }
        return instance;
    }

    public void placeOrder() {
        System.out.println("Place order method is invoked");
    }
}
