package objectorientedconcepts;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class JavaConsumerSupplier {
    public static void main(String[] args) {
        List<ProductDetls> products = List.of(
                new ProductDetls("Laptop", 1200.0, "Electronics", "Regular"),
                new ProductDetls("Mouse", 20.0, "Accessories", "Regular"),
                new ProductDetls("Smartphone", 800.0, "Electronics", "Regular"),
                new ProductDetls("Headphones", 1500.0, "Electronics", "Regular"),
                new ProductDetls("Backpack", 50.0, "Accessories", "Regular")
        );

        // 1. Consumer to print product to appropriate medium (console or file)
        Consumer<ProductDetls> productPrinter = product -> {
            if ("file".equals(System.getProperty("print"))) {
                try (PrintWriter writer = new PrintWriter(new FileWriter("products.txt", true))) {
                    writer.println(product);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(product);
            }
        };

        // Example usage:
        products.forEach(productPrinter);

        // Set system property to print to file
        System.setProperty("print", "file");
        products.forEach(productPrinter);
        
     // 2. Consumer to update grade of products with price > 1000 to 'Premium' and print all products
        Consumer<ProductDetls> premiumGradeUpdater = product -> {
            if (product.getPrice() > 1000) {
                product.setGrade("Premium");
            }
        };

        // Update grades and print all products
        products.forEach(premiumGradeUpdater.andThen(System.out::println));
        
        
     // 3. Consumer to update name with '*' suffix for products with price > 3000 and print all products
        Consumer<ProductDetls> nameUpdater = product -> {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
            }
        };

        // Update names and print all products
        products.forEach(nameUpdater.andThen(System.out::println));
        
     // 4. Print Premium grade products with name suffixed with '*'
        products.stream()
                .filter(product -> "Premium".equals(product.getGrade()))
                .filter(product -> product.getName().endsWith("*"))
                .forEach(System.out::println);

  

        // 1. Supplier to produce a random product
        Supplier<ProductDetls> randomProductSupplier = () -> {
            Random random = new Random();
            String[] categories = {"Electronics", "Accessories"};
            String[] names = {"Laptop", "Mouse", "Smartphone", "Headphones", "Backpack"};
            double price = random.nextDouble() * 5000; // Random price below 5000
            String category = categories[random.nextInt(categories.length)];
            String name = names[random.nextInt(names.length)];
            return new ProductDetls(name, price, category, "Regular");
        };

        // Example usage:
        ProductDetls randomProduct = randomProductSupplier.get();
        System.out.println("Random Product: " + randomProduct);
        
        
     // 2. Supplier to produce a random OTP
        Supplier<String> otpSupplier = () -> {
            Random random = new Random();
            StringBuilder otp = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                otp.append(random.nextInt(10)); // Random digit from 0 to 9
            }
            return otp.toString();
        };

        // Example usage:
        String otp = otpSupplier.get();
        System.out.println("Random OTP: " + otp);




    }
}
