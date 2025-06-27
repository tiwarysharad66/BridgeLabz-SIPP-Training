import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products)
            System.out.println(" - " + p.name);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    Order placeOrder(Product... products) {
        Order o = new Order();
        for (Product p : products) o.addProduct(p);
        return o;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer c = new Customer("Alice");
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        Order o = c.placeOrder(p1, p2);
        o.showOrder();
    }
}