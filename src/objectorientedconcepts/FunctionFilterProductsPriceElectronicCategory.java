package objectorientedconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class FunctionFilterProductsPriceElectronicCategory {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 1200.0, "Electronics", 1),
            new Product("Mouse", 20.0, "Accessories", 2),
            new Product("Smartphone", 800.0, "Electronics", 1),
            new Product("Headphones", 1500.0, "Electronics", 2),
            new Product("Backpack", 50.0, "Accessories", 1)
        );

        // Function to filter and calculate cost of products > 1000 and in electronic category
        Function<List<Product>, List<Product>> filterProductsAbove1000AndElectronic = productList -> {
            List<Product> filteredProducts = new ArrayList<>();
            for (Product product : productList) {
                if (product.getPrice() > 1000 && "Electronics".equalsIgnoreCase(product.getCategory())) {
                    filteredProducts.add(product);
                }
            }
            return filteredProducts;
        };

        // Example usage
        List<Product> expensiveElectronicProducts = filterProductsAbove1000AndElectronic.apply(products);
        System.out.println("Products with price > 1000 and in electronic category:");
        for (Product product : expensiveElectronicProducts) {
            System.out.println(product);
        }
    }
}
