package objectorientedconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class BiFunctionToCalculateProductCost {
    public static void main(String[] args) {
        // BiFunction to calculate cost of products in a cart
        BiFunction<Map<Product, Integer>, Product, Double> calculateCartCost = (cart, product) -> {
            double totalCost = 0.0;
            for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
                if (entry.getKey().equals(product)) {
                    totalCost += entry.getKey().getPrice() * entry.getValue();
                }
            }
            return totalCost;
        };

        // Example cart (map of Product to quantity)
        Map<Product, Integer> cart = new HashMap<>();
        Product product1 = new Product("Laptop", 1200.0, "Electronics", 1);
        Product product2 = new Product("Mouse", 20.0, "Accessories", 2);

        cart.put(product1, 2); // Adding 2 laptops to the cart
        cart.put(product2, 5); // Adding 5 mice to the cart

        // Example product to calculate cost for
        Product productToCalculate = product1;

        double cost = calculateCartCost.apply(cart, productToCalculate);
        System.out.println("Total cost for " + productToCalculate.getName() + " in the cart: $" + cost);
    }
}

