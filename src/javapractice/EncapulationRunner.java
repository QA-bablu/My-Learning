package javapractice;

public class EncapulationRunner {

	public static void main(String[] args) {
		
		EncapsulationExample ene = new EncapsulationExample();
		ene.setName("bablu");
		ene.setAge(31);
		ene.setId("001119293");
		
		System.out.println("Name : "+ene.getName()+" Age :"+ene.getAge());
		ene.setAge(32);
		System.out.println("After resetting age");
		System.out.println("Name : "+ene.getName()+" Age :" +ene.getAge());
	}

}
