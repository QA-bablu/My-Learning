package javapractice;

public class IndianAirCrafts extends AircraftConstructionRules {
	public static void main(String[] args) {

		AircraftConstructionRules ac = new IndianAirCrafts();
		ac.airCraftDesign();
		ac.airLinesName();
		ac.engine();

	}

	@Override
	public void airLinesName() {
		System.out.println("Indian Airways");

	}

}
