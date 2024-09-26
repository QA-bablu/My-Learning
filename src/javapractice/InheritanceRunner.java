package javapractice;

public class InheritanceRunner {
	
	public static void main(String[] args) {
		
		Person mother = new Person("John Bee", "Shaik");
		Person father = new Person("Lal Saheb", "Shaik");
		
		Person child = new Child("Babulu", "Shaik", mother, father);
		System.out.println(child.getInfo());
		
	}

}
