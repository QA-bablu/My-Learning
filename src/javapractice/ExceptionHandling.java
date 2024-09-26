package javapractice;

public class ExceptionHandling  extends Throwable{

	// throw - is a keyword used to throw a new exception in a block or method but
	// that exception must be type java.lang.Throwable class or its subclasses

	/*
	 * public void getData(int a, int b) {
	 * 
	 * throw new ArithmeticException(); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * ExceptionHandling c = new ExceptionHandling(); //c.getData(10, 0);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
//------------------------------------------------------------------

	// throws - is a keyword used in method signature to intimate that method may
	// throws an exception
	// 1 - way

	/*public void getClassDetails() throws ClassNotFoundException {

		Class c = Class.forName("Exception handling.ThrowsKeyword");
		System.out.println(c.getClassLoader());

	}

	public static void main(String[] args){

		ExceptionHandling c = new ExceptionHandling();
		
		// throws an exception
		// 2 - way

		try {s
			c.getClassDetails();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
	//-----------------------------------------------------------------------------------
	
	//Throwable- 
	
	
	ExceptionHandling(String message){
		super(message);
	}
	
	
}
