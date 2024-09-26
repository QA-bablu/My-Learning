package TestNGFramework;



public interface TestInt2 extends TestInt{
	
	public int mul(int a, int b);
	
	default void getData() {
		
		System.out.println("hello");
	}

}
