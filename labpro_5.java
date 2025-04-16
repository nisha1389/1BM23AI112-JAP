import java.util.Vector;
class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void showProduct() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Category: " + category);
    }
}

public class Main{
    Vector<Product> inventory = new Vector<>();

    void addProduct(String name, double price, String category) {
        Product newProduct = new Product(name, price, category);
        inventory.add(newProduct);
        System.out.println("Added: " + name);
    }
    void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                System.out.println("Removed: " + name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    void displayProducts() {
        System.out.println("\n--- Product Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : inventory) {
                p.showProduct();
            }
        }
    }


    public static void main(String[] args) {
        Main manager = new Main();


        manager.addProduct("Phone", 699.99, "Electronics");
        manager.addProduct("Sneakers", 89.99, "Footwear");
        manager.addProduct("Notebook", 2.99, "Stationery");

        // Show products
        manager.displayProducts();

        // Remove one product
        manager.removeProduct("Sneakers");

        // Show updated list
        manager.displayProducts();
    }
}

