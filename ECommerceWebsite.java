//2. write a program to demostrate e-commerce website using inheritance, abstract class and dynamic polymorphism in java
import java.util.ArrayList;

//Abstract class for products
abstract class Product {
	protected String name;
	protected double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public abstract void displayProductDetails();
}

//Concrete class for electronics products
class Electronics extends Product {
	protected String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Product name: " + name);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
}

//Concrete class for clothing products
class Clothing extends Product {
	protected String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Product name: " + name);
		System.out.println("Size: " + size);
		System.out.println("Price: " + price);
	}
}

//Abstract class for customers
class Customer {
	protected String name;
	protected String address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// @Override
	public void displayCustomerDetails() {
		System.out.println("Customer name: " + name);
		System.out.println("Address: " + address);
	}
}

//Main class for e-commerce website
public class ECommerceWebsite {
	public static void main(String[] args) {
		// Create a list of products
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Electronics("Smartphone", 500.0, "Samsung"));
		productList.add(new Clothing("T-shirt", 20.0, "L"));

		// Create a list of customers
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("John", "123 Main St."));
		customerList.add(new Customer("Jane", "456 Elm St."));

		// Display product details
		for (Product product : productList) {
			product.displayProductDetails();
		}

		// Display customer details
		for (Customer customer : customerList) {
			customer.displayCustomerDetails();
		}
	}
}

