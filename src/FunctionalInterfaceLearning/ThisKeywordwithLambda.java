package FunctionalInterfaceLearning;

import TestNGFramework.TestInt;

public class ThisKeywordwithLambda {
	
	int x=777;
	
	public void m2() {
		TestInt i= ()->{
		int x =888;
		System.out.println("local variable x values is "+x);
		System.out.println("class variable x values is "+this.x);
		};
		
		i.m1();
	}
	
	public static void main(String[] args) {
		
		ThisKeywordwithLambda t = new ThisKeywordwithLambda();
		t.m2();
	}

}
