package objectorientedconcepts;

import java.util.List;

// Define the Pizza class
class Pizza {
    public Base base;
    public List<Topping> toppings;

    public Pizza(Base base, List<Topping> toppings) {
        this.base = base;
        this.toppings = toppings;
    }

    public double calculateCost() {
        double totalCost = base.getCost();
        for (Topping topping : toppings) {
            totalCost = totalCost +topping.getCost();
        }
        return totalCost;
    }
}


