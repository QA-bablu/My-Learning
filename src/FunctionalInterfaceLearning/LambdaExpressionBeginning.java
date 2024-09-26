package FunctionalInterfaceLearning;

public interface LambdaExpressionBeginning {

	public int m1(int x);

	public class Test implements LambdaExpressionBeginning {

		@Override
		public int  m1(int x) {
			
			LambdaExpressionBeginning i = (s)->{return x*x};
		
			
			
		}

		
		

		
	}

	public static void main(String[] args) {

		LambdaExpressionBeginning t = new Test();
		System.out.println("The sqare of 7 is :- " + t.m1(7));

	}

}
