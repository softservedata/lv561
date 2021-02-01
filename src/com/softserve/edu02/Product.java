package com.softserve.edu02;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("IPhone", 770, 10);
        Product product2 = new Product("Samsung", 650,15);
        Product product3 = new Product("Xiomi", 550, 21);
        Product[] products = new Product[] {product1,product2,product3};
        int maxPrice = products[0].price;
        int maxQuantity = products[0].quantity;

        for (Product product: products) {       // it this loops we determine the max price and max quantity
            if (maxPrice < product.price) {
                maxPrice = product.price;
            }
            if (maxQuantity < product.quantity) {
                maxQuantity = product.quantity;
            }
        }

        for (Product product : products) {
            if (maxPrice == product.price) {        // Here we will output name and quantity of the most expensive product. Some checks added also
                if (product.quantity == 0) {
                    System.out.println("Highest price has a product name: "+product.name+" but now they we don't have it");
                } else if (product.quantity == 1) {
                    System.out.println("Highest price has a product name: "+product.name+" and we have only one of it");
                } else {
                    System.out.println("Highest price has a product name: "+product.name+" and there are "+product.quantity+" of them");
                }
            }
            if (maxQuantity == product.quantity) {
                    if (maxQuantity == 0) {
                        System.out.println("Actually we don't have any stocks");
                    } else if (maxQuantity == 1) {
                        System.out.println("We have only one "+product.name+" product. It costs: "+product.price+"$");
                    } else {
                        System.out.println("We have enough of "+product.name+"'s products. One product costs: "+product.price+"$");
                    }
            }
        }

    }
}
