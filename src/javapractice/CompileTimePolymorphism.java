package javapractice;

public class CompileTimePolymorphism {
	

	public void draw() {
		System.out.println("Drwaing circle with default color Black and diameter 1 cm.");
	}

	public void draw(int diameter) {
		System.out.println("Drwaing circle with default color Black and diameter" + diameter + "cm");

	}

	public void draw(int diameter, String color) {
		System.out.println("Drwaing circle with default color" + color + "Black and diameter" + diameter + "cm");

	}
	
	public static void main(String[] args) {
		
		CompileTimePolymorphism pm = new CompileTimePolymorphism();
		pm.draw();
		pm.draw(8);
		pm.draw(6, "black");	
	}
}
