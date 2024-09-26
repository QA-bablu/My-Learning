package Predicate;

import java.util.function.Predicate;

public class Predicate_isEqual {
	
	public static void main(String[] args) {
		
		String name = "babluu";
		Predicate<String> stringPredicate = Predicate.isEqual("bablu");// static method so we can call it with Predicate Reference 
		
	System.out.println(stringPredicate.test(name));
	
	}

}
