package javapractice;

public class ConcreteDemo extends AbstractDemo{


	public static void main(String[] args) {
		
		AbstractDemo ad = new ConcreteDemo();
		ad.method1();
		ad.method2();
	}

	@Override
	public void method2() {
		
		System.out.println("override the method from abstract class");
		
	}
	
	
}
