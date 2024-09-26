package javapractice;

public class CompileTimePoly {
	
	public void draw()
	{
		System.out.println("Draw a diagram by using color black and diameter 1 cm");
	}
	
	public void draw(int diameter)
	{
		System.out.println("Draw a diagram by using color black and "+ diameter+" cm");
	}
	
	public void draw(int diameter, String color)
	{
		System.out.println("Draw a diagram by using "+color+" color black and "+diameter+"cm");
	}
	
	public void draw(int diameter, int num)
	{
		System.out.println("Draw "+num+" diagram by using color black and "+diameter+" cm");
	}

	public static void main(String[] args) {
		
		CompileTimePoly cp = new CompileTimePoly();
		cp.draw(4, "red");
	}
}
