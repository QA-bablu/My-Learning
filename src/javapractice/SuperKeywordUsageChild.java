package javapractice;

public class SuperKeywordUsageChild extends SuperKeywordUsage {

	public static void main(String[] args) {

		SuperKeywordUsage su = new SuperKeywordUsageChild();

		System.out.println(su.name);
		
		su.getData();

		SuperKeywordUsageChild sd = new SuperKeywordUsageChild();

		sd.getData();

	}

	String name = "Ramya";

	public void getData() {
		
		super.getData();

		//System.out.println(super.name);
	}

	
	
}
