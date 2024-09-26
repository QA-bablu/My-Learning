package javapractice;

public class Mummal implements Animal {

	public static void main(String[] args) {

		Animal mm = new Mummal();
		mm.eat();
		mm.travel();
		
		Mummal mm1 = new Mummal();
		System.out.println("No of legs are " + mm1.noOfLegs(4));

	}

	@Override
	public void eat() {

		System.out.println("Mummal eats");

	}

	@Override
	public void travel() {

		System.out.println("Mammal travels");

	}

	public int noOfLegs(int legs) {
		return legs;
	}

}
