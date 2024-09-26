package Function;

import java.util.function.Function;

public class Function_compose {

	public static void main(String[] args) {

		Function<String, String> function_1 = str -> {

			return str.toUpperCase();
		};

		Function<String, String> function_2 = str -> {
			return str.substring(0, 8);
		};

		// System.out.println("result of function_1
		// "+function_1.apply("iamramyabablu"));
		// System.out.println("result of function_2
		// "+function_2.apply("iamramyabablu"));
		System.out.println(function_1.compose(function_2).apply("iamramyabablu")); 
		
		//result of andThen is- IAMRAMYA
		//result of compose is- IAMRAMYA
	}
}
