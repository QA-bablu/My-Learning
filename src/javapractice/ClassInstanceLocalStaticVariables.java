package javapractice;

public class ClassInstanceLocalStaticVariables {

	// these are the instance variables because depends on instance/object

	private String name;
	private static String address = "khammam";
	private static long countryCode = 91;
	static int i = 0;

	public ClassInstanceLocalStaticVariables(String name) {

		this.name = name;
		i++;
		System.out.println(i);

	}

	public void getData() {
		System.out.println(name + " " + address + " " + countryCode);
	}

	public static void main(String[] args) {

		ClassInstanceLocalStaticVariables cls = new ClassInstanceLocalStaticVariables("bablu");
		ClassInstanceLocalStaticVariables cls1 = new ClassInstanceLocalStaticVariables("ramya");
		cls.getData();
		cls1.getData();

	}

}
