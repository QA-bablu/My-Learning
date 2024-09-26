package javapractice;

public class ConstructorsUsage {

	public static void main(String[] args) {

		ConstructorsUsage cu = new ConstructorsUsage("bablu");

	}

	private ConstructorsUsage() {

		System.out.println("Default Constructor");
	}

	private ConstructorsUsage(String nm) {

		System.out.println(nm);

	}
}
