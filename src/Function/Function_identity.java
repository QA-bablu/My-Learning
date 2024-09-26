package Function;

import java.util.function.Function;

public class Function_identity {

	public static void main(String[] args) {

		/*
		 * Function<Integer,Integer> function = Function.identity();
		 * System.out.println(function.apply(100));
		 */

		Function<String, String> function = Function.identity();
		System.out.println(function.apply("Test"));

	}

}
