package Supplier;

import java.util.function.Supplier;

public class Supplier_get {

	public static void main(String[] args) {

		String[] stringArray = { "bablu", "ramya", "aarush" };

		Supplier<String> stringSupplier = () -> {

			int x = (int) (Math.random() * 3);
			return stringArray[x];
		};

		System.out.println(stringSupplier.get());
		System.out.println(stringSupplier.get());
		System.out.println(stringSupplier.get());

	}
}