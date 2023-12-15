package com.learnquest.inventorysystem;

public class Inventory {
    public static void produceReport(Item[] items) {
        int totalCount = 0;
        double totalValue = 0.0;
        for (Item item : items) {
            if (item != null) {
                System.out.println("Calculating for item .... " + item.getTitle());
                System.out.println("Price = " + item.getPrice());
                System.out.println("Item quantity = " + item.getQuantity());
                totalCount = totalCount + item.getQuantity();
                totalValue = totalValue + item.getPrice() * item.getQuantity();
            }

        }
        System.out.println("Total Items = " + totalCount);
        System.out.println("Total Price = " + totalValue);
    }
}
