package FunctionalInterfaceLearning;

public class AnonymousInnerClasswithLambda {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(()->{
			
			for(int i=0;i<2;i++) {
				
				System.out.println("child thread");
			}
			
		});
		
		thread.start();
		for(int i=0;i<2;i++)
			System.out.println("main thread");
		
	}

}
