package objectorientedconcepts;

import java.util.List;
import java.util.stream.Collectors;

public class GetAllProductsPrice {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 1200.0, "Electronics", 1),
                new Product("Mouse", 20.0, "Accessories", 2),
                new Product("Smartphone", 800.0, "Electronics", 1),
                new Product("Headphones", 1500.0, "Electronics", 2),
                new Product("Backpack", 50.0, "Accessories", 1)
        );

        // 1. Get all Products with Price > 1000
        List<Product> expensiveProducts = products.stream()
                .filter(product -> product.getPrice() > 1000)
                .collect(Collectors.toList());

        System.out.println("Products with price > 1000:");
        expensiveProducts.forEach(System.out::println);
        
        
     // 2. Get all Products from Electronics Category
        List<Product> electronicsProducts = products.stream()
                .filter(product -> "Electronics".equals(product.getCategory()))
                .collect(Collectors.toList());

        System.out.println("\nProducts from Electronics category:");
        electronicsProducts.forEach(System.out::println);
        
     // 3. Get all Products with Price > 1000 and from Electronics Category (Change Name to CAP letters)
        List<Product> expensiveElectronicsProducts = products.stream()
                .filter(product -> product.getPrice() > 1000 && "Electronics".equals(product.getCategory()))
                .map(product -> new Product(product.getName().toUpperCase(), product.getPrice(), product.getCategory(), product.getGrade()))
                .collect(Collectors.toList());

        System.out.println("\nProducts with price > 1000 and from Electronics category (Name in CAP letters):");
        expensiveElectronicsProducts.forEach(System.out::println);
        
        
     // 4. Calculate the count of all electronic products
        long electronicProductsCount = products.stream()
                .filter(product -> "Electronics".equals(product.getCategory()))
                .count();

        System.out.println("\nNumber of electronic products: " + electronicProductsCount);



    }
}

