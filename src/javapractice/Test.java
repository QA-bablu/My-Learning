package javapractice;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		
		int a = 20;
		
		if(a<0)
		{
			System.out.println("a is greater than "+a);
			
		}
		else
		{
			throw new Exception("no items in the cart");
		}
		
		
	}

}
