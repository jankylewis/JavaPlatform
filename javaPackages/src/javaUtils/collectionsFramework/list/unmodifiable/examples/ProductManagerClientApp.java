
package javaUtils.collectionsFramework.list.unmodifiable.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagerClientApp {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();

        // Add some products
        productManager.addProduct(new Product("Product 1", 10.99));
        productManager.addProduct(new Product("Product 2", 19.99));
        productManager.addProduct(new Product("Product 3", 5.99));

        // Get the unmodifiable list of products
        List<Product> products = productManager.getProducts();

        // Iterate over the products
        products.forEach(p -> System.out.println(p.name() + " - $" + p.price()));
    }
}

class ProductManager {

    private final List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        // ... initialize products
    }

    public synchronized List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public synchronized void addProduct(Product product) {
        products.add(product);
    }

    // ... other methods
}

record Product(String name, double price){}