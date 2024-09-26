package javapractice;

public class BritishAirCrafts extends AircraftConstructionRules {

	public static void main(String[] args) {

		AircraftConstructionRules acs = new BritishAirCrafts();
		
		acs.engine();
		acs.airCraftDesign();
		acs.airLinesName();

	}

	@Override
	public void airLinesName() {
		System.out.println("Brtish Airways");

	}

}
