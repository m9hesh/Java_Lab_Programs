//2. write a program to demostrate e-commerce website using inheritance, abstract class and dynamic polymorphism in java
import java.util.ArrayList;

// Abstract class for products
abstract class Product {
    protected String name;
    protected double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public abstract void displayProductDetails();
}

// Concrete class for electronics products
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

// Concrete class for clothing products
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

// Abstract class for customers
abstract class Customer {
    protected String name;
    protected String address;
    
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public abstract void displayCustomerDetails();
}

// Concrete class for regular customers
class RegularCustomer extends Customer {
    protected double discountRate;
    
    public RegularCustomer(String name, String address, double discountRate) {
        super(name, address);
        this.discountRate = discountRate;
    }
    
    @Override
    public void displayCustomerDetails() {
        System.out.println("Customer name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Discount rate: " + discountRate);
    }
}

// Concrete class for premium customers
class PremiumCustomer extends Customer {
    protected int bonusPoints;
    
    public PremiumCustomer(String name, String address, int bonusPoints) {
        super(name, address);
        this.bonusPoints = bonusPoints;
    }
    
    @Override
    public void displayCustomerDetails() {
        System.out.println("Customer name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Bonus points: " + bonusPoints);
    }
}

// Main class for e-commerce website
public class ECommerceWebsite {
    public static void main(String[] args) {
        // Create a list of products
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Electronics("Smartphone", 500.0, "Samsung"));
        productList.add(new Clothing("T-shirt", 20.0, "L"));
        
        // Create a list of customers
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new RegularCustomer("John", "123 Main St.", 0.1));
        customerList.add(new PremiumCustomer("Jane", "456 Elm St.", 100));
        
        // Display product details
        for (Product product : productList) {
            product.displayProductDetails();
        }
        
        // Display customer details
        for (Customer customer : customerList){  
            customer.displayCustomerDetails();
        }
    }
}
