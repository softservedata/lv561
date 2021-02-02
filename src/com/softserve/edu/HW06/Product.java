package com.softserve.edu.HW06;

/*-
 * Create class Product with
 * fields name,
 * price and quantity.
 * Create four
 * instances of type Product.
 * Display the name and quantity of the most
 * expensive item. Display the name of the items, which has the biggest
 * quantity.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Product {
	private String name;
	private double price;
	private double quantity;

	private Product() {
		name = "NoName";
		price = 0.0;
		quantity = 0.0;
	}

	private Product(String name, double price, double quantity) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public static void main(String[] args) {
		Product prod1 = new Product("Bananas", 20.5, 10.3);
		System.out.println(prod1);
		Product prod2 = new Product("Orange", 23.3, 21);
		System.out.println(prod2);
		Product prod3 = new Product("Mango", 40, 10);
		System.out.println(prod3);
		Product prod4 = new Product("Apple", 10.4, 43);
		System.out.println(prod4);

		double max_price = prod1.getPrice();
		double max_quantity = prod1.getQuantity();
		String max_name = prod1.getName();

		if (max_price < prod2.getPrice()) {
			max_price = prod2.getPrice();
			max_name = prod2.getName();
			max_quantity = prod2.getQuantity();
		}
		if (max_price < prod3.getPrice()) {
			max_price = prod3.getPrice();
			max_name = prod3.getName();
			max_quantity = prod3.getQuantity();
		}
		if (max_price < prod4.getPrice()) {
			max_price = prod4.getPrice();
			max_name = prod4.getName();
			max_quantity = prod4.getQuantity();
		}
		System.out.println("Most expensive product is " + max_name + " quantity: " + max_quantity);
		
		max_quantity = prod1.getQuantity();
		max_name = prod1.getName();
		if (max_quantity < prod2.getQuantity()) {
			max_price = prod2.getPrice();
			max_name = prod2.getName();
			max_quantity = prod2.getQuantity();
		}
		if (max_quantity < prod3.getQuantity()) {
			max_price = prod3.getPrice();
			max_name = prod3.getName();
			max_quantity = prod3.getQuantity();
		}
		if (max_quantity < prod4.getQuantity()) {
			max_price = prod4.getPrice();
			max_name = prod4.getName();
			max_quantity = prod4.getQuantity();
		}
		
		System.out.println(max_name + " has the biggest quantity: " + max_quantity);
		
		
		
	}

}
