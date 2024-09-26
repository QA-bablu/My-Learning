package javalearning;

class Product {
    private String name;
    private double price;
    private String category;
    private int grade;

    public Product(String name, double price, String category, int grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getGrade() {
        return grade;
    }
}

