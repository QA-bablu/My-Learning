package objectorientedconcepts;

import java.util.ArrayList;
import java.util.List;
	
	public class PizzaShop {
	    public static void main(String[] args) {
	        // Define the available bases
	        Base standardBase = new Base("Standard", 5);
	        Base softBase = new Base("Soft", 6);

	        // Define the available toppings
	        Topping tomato = new Topping("Tomato", 1);
	        Topping corn = new Topping("Corn", 2);
	        Topping mushrooms = new Topping("Mushrooms", 3);

	        // Example pizza creation
	        List<Topping> myToppings = new ArrayList<>();
	        myToppings.add(tomato);
	        myToppings.add(corn);
	        myToppings.add(mushrooms);

	        Pizza pizzaOrder = new Pizza(standardBase, myToppings);

	        // Calculate the cost of the pizza
	        double totalCost = pizzaOrder.calculateCost();
	        System.out.println("Total cost of the pizza: " + totalCost);
	    }
	}


