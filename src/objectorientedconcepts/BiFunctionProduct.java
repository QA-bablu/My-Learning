package objectorientedconcepts;

import java.util.function.BiFunction;

class BiFunctionProduct {
    public static void main(String[] args) {
        BiFunction<String, Double, Product> createProduct = (name, price) -> new Product(name, price, "", 0);

        String productName = "Laptop";
        double productPrice = 1200.0;

        Product product = createProduct.apply(productName, productPrice);
        System.out.println("Created Product:");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Grade: " + product.getGrade());
    }
}

