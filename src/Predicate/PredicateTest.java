package Predicate;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		/*Predicate<Integer> integerPredicate = (i) -> i > 9;

		System.out.println(integerPredicate.test(10));
		System.out.println(integerPredicate.test(0));
		System.out.println(integerPredicate.test(9));*/
		
		
		Predicate<String> stringPredicate = (i)->i.contains("bab");
		
		System.out.println(stringPredicate.test("bablu"));
		System.out.println(stringPredicate.test("ramya"));
		System.out.println(stringPredicate.test("aba"));
		stringPredicate.test("aarush");
		
		

	}
}