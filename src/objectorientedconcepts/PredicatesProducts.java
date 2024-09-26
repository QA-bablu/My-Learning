package objectorientedconcepts;

import java.util.List;
import java.util.function.Predicate;

class PredicatesProducts {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 1200.0, "Electronics", 1),
            new Product("Mouse", 20.0, "Accessories", 2),
            new Product("Smartphone", 800.0, "Electronics", 1),
            new Product("Headphones", 1500.0, "Electronics", 2),
            new Product("Backpack", 50.0, "Accessories", 1)
        );

        // Predicate to check if product price > 1000
        Predicate<Product> priceAbove1000Predicate = product -> product.getPrice() > 1000;

        // Predicate to check if product category is Electronics
        Predicate<Product> electronicsCategoryPredicate = product -> "Electronics".equalsIgnoreCase(product.getCategory());

        // Predicate to check if product price > 100 and in electronics category
        Predicate<Product> priceAbove100AndElectronicsPredicate = priceAbove1000Predicate.and(electronicsCategoryPredicate);

        // Predicate to check if product price < 100 and in electronics category
        Predicate<Product> priceBelow100AndElectronicsPredicate = product -> product.getPrice() < 100 && "Electronics".equalsIgnoreCase(product.getCategory());

        // Predicate to check if product price > 100 or in electronics category
        Predicate<Product> priceAbove100OrElectronicsPredicate = priceAbove1000Predicate.or(electronicsCategoryPredicate);

        // Printing products based on predicates
        System.out.println("Products with price > 1000:");
        printFilteredProducts(products, priceAbove1000Predicate);

        System.out.println("\nProducts in Electronics category:");
        printFilteredProducts(products, electronicsCategoryPredicate);

        System.out.println("\nProducts with price > 100 and in Electronics category:");
        printFilteredProducts(products, priceAbove100AndElectronicsPredicate);

        System.out.println("\nProducts with price < 100 and in Electronics category:");
        printFilteredProducts(products, priceBelow100AndElectronicsPredicate);

        System.out.println("\nProducts with price > 100 or in Electronics category:");
        printFilteredProducts(products, priceAbove100OrElectronicsPredicate);
    }

    private static void printFilteredProducts(List<Product> products, Predicate<Product> predicate) {
        for (Product product : products) {
            if (predicate.test(product)) {
                System.out.println(product);
            }
        }
    }
}

