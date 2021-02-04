package com.conditionStatements;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        name = "";
        price = 0.0f;
        quantity = 0;
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static void main(String[] args) {
        Product
                a1 = new Product("Computer", 44.2, 12),
                a2 = new Product("Phone", 12.4, 24),
                a3 = new Product("Microwave", 8.4, 8),
                a4 = new Product("Fridge", 6.2, 11);

        /**
         * most expensive item
         */
        double maxPrice = a1.getPrice();
        Product productWithMaxPrice = a1;

        if (maxPrice < a2.getPrice()) {
            maxPrice = a2.getPrice();
            productWithMaxPrice = a2;
        }
        if (maxPrice < a3.getPrice()) {
            maxPrice = a3.getPrice();
            productWithMaxPrice = a3;
        }
        if (maxPrice < a4.getPrice()){
            maxPrice = a4.getPrice();
            productWithMaxPrice = a4;
        }

        System.out.printf(
                "The most expensive item:\n" +
                "\t%s\t%d\n",
                productWithMaxPrice.getName(), productWithMaxPrice.getQuantity()
                );

        /**
         * Items with the biggest quantity
         */
        int maxQuantity = a1.getQuantity();
        Product productWithMaxQuantity = a1;

        if (maxQuantity < a2.getQuantity()) {
            maxQuantity = a2.getQuantity();
            productWithMaxQuantity = a2;
        }
        if (maxQuantity < a3.getQuantity()) {
            maxQuantity = a3.getQuantity();
            productWithMaxQuantity = a3;
        }
        if (maxQuantity < a4.getQuantity()){
            maxQuantity = a4.getQuantity();
            productWithMaxQuantity = a4;
        }

        System.out.printf(
                "Item with the biggest quantity:\n\t%s", productWithMaxQuantity.getName());
    }
}
