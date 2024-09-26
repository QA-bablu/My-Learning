package FunctionalInterfaceLearning;

import TestNGFramework.TestInt;

public class WithLambdaEx {

	public static void main(String[] args) {

		TestInt i = (int a,int b) -> a * b;

		System.out.println("The result is  "+i.add(7,9));
	}

}
