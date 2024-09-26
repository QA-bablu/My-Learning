package objectorientedconcepts;

import java.util.List;
import java.util.function.Function;

class FunctionToFilterCalculateCostOfElectronicProducts {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 1200.0, "Electronics", 1),
            new Product("Mouse", 20.0, "Accessories", 2),
            new Product("Smartphone", 800.0, "Electronics", 1),
            new Product("Headphones", 1500.0, "Electronics", 2),
            new Product("Backpack", 50.0, "Accessories", 1)
        );

        // Function to calculate total cost of electronic products
        Function<List<Product>, Double> calculateElectronicProductsCost = productList -> {
            double totalCost = 0.0;
            for (Product product : productList) {
                if ("Electronics".equalsIgnoreCase(product.getCategory())) {
                    totalCost += product.getPrice();
                }
            }
            return totalCost;
        };

        // Example usage
        double electronicProductsCost = calculateElectronicProductsCost.apply(products);
        System.out.println("Total cost of electronic products: $" + electronicProductsCost);
    }
}
