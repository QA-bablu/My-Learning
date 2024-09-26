package Predicate;

import java.util.function.Predicate;

public class PredicateJoinning_negate {
	
	
	public static void testConditions(Predicate<Integer> integerPredicate, int[] ListOfNumbers) {
		
		for(int number:ListOfNumbers) {
			
			if(integerPredicate.test(number)) {
				
				System.out.println(number);
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int [] numbers = {0,5,10,15,20,25,30};
		
		Predicate<Integer> predicate_1 = i->i>10; // number not greater than 10 - 0, 5, 10
		Predicate<Integer> predicate_2 = i->i%2==0;
		
		testConditions(predicate_1.negate(), numbers);
		//testConditions(predicate_2.negate(), numbers);
	}

}
