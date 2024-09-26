package FunctionalInterfaceLearning;

import TestNGFramework.TestInt;

public class WithoutLambdaEx implements TestInt {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		
		TestInt t = new WithoutLambdaEx();
		System.out.println(t.add(40, 50));
	}

}
