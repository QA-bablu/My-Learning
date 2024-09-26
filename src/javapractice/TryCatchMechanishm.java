package javapractice;

public class TryCatchMechanishm {
	
	public int division(int a, int b) {
		
		int div = 0;
		try {
		div =a/b;
		}
		catch(IndexOutOfBoundsException e){
			
			//e.printStackTrace();
			
		}
		
		catch(Exception e1) {
			
			System.out.println("catched arithmetic exception");
			
		
			
			
		}
		finally {
			
			System.out.println("driver.quit will happend");
		}
		return div;
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		TryCatchMechanishm c = new TryCatchMechanishm();
		c.division(10, 0);
		
	}

}
