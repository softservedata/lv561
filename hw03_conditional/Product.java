package hw03_conditional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Task 4 : class Product
 *  - create four instances of type Product
 *  - display the name and quantity of the most expensive item
 *  - display the name of the items, which have the biggest quantity
 */

public class Product {
	private String name;
	private double price;
	private int quantity;

	Product() {}

	Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * sorting products by price to get the most expensive one
	 */

	static Comparator<Product> byPrice = new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			int price1 = (int) o1.getPrice();
			int price2 = (int) o2.getPrice();
			return price2 - price1;
		}
	};

	/*
	 * sorting products by quantity to get the one which has the biggest quantity
	 */

	static Comparator<Product> byQuantity = new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			int quantity1 = o1.getQuantity();
			int quantity2 = o2.getQuantity();
			return quantity2 - quantity1;
		}

	};

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product("book", 235.50, 35),
				p2 = new Product("workbook", 126.70, 17),
				p3 = new Product("manual", 469.90, 38),
				p4 = new Product("journal", 87.00, 45);
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
			
		Collections.sort(products, Product.byPrice);
		System.out.println("Most expensive item: " + products.get(0));
		
		Collections.sort(products, Product.byQuantity);
		System.out.println("Biggest quantity has the item: " + products.get(0));
		
	}

}
