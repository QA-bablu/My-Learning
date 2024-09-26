package Function;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		// Function<String,Integer>

		/*
		 * Function<String, Integer> stringFunction = i -> i.length();
		 * 
		 * System.out.println(stringFunction.apply("bablu"));
		 */

		// Function<String,String>

		Function<String, String> function = str -> {
			
			return str.replaceAll(" ", "");
		};

		System.out.println(function.apply("bab l u"));

	}

}
