package com.softserve.tree;


public class Product {
    public String name = "NoName";
    public int price = 0;
    public int quantity = 0;

    public Product() {
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

//    public Object mostExpensive() {
//        for (Object t :)
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        Product[] prod = new Product[4];
        prod[0] = new Product("milk", 23, 3);
        prod[1] = new Product("salt", 44, 2);
        prod[2] = new Product("bred", 22, 1);
        prod[3] = new Product("meat", 42, 4);
//        System.out.println(prod[0].name);
        Product max = new Product();
        for (int i = 0; i < prod.length; i++) {
            if (max.price < prod[i].price) {
                max = prod[i];
            }
        }
        System.out.println("Most expensive - " + max.toString());
        Product max1 = new Product();
        for (int i = 0; i < prod.length; i++) {
            if (max.quantity < prod[i].quantity) {
                max1 = prod[i];
            }

        }
        System.out.println("Biggest quantity - " + max1.toString());

    }

}

