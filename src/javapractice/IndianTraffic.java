package javapractice;

public class IndianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		
		IndianTraffic it = new IndianTraffic();
		it.green();
		it.orange();
		it.red();
		it.yellow();
		
		
				
		CentralTraffic	cti =new IndianTraffic();
		
		cti.green();
		cti.orange();
		cti.red();
		
	}

	@Override
	public void green() {

		System.out.println("Everone should start moving");

	}

	@Override
	public void orange() {

		System.out.println("Everone should move slowly");

	}

	@Override
	public void red() {
		System.out.println("Everone should stop");

	}

	public void yellow() {

		System.out.println("Everone should walk");
	}

}
