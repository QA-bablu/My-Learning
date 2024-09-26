package Consumer;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> consumer = (s) -> {

			System.out.println(s.length()); // it wont return anything
		};

		consumer.accept("test");

	}

}
