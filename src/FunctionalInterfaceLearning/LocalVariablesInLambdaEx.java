package FunctionalInterfaceLearning;

public interface LocalVariablesInLambdaEx {
	
	public void m3();
	
	public class Demo1{
		
		int x =10;
		
		public void m2() {
			
			int y=20;
			LocalVariablesInLambdaEx i = ()->{
				
				System.out.println(x);
				System.out.println(y);
				
			};
			
			i.m3();
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.m2();
	}

}
