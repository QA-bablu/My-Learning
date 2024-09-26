package objectorientedconcepts;

public class CalculateBouquetCost {
	public static void main(String[] args) {

		Rose rose = new Rose();
		Jasmine jasmine = new Jasmine();
		Lily lily = new Lily();

		Bouquet bouquet = new Bouquet(new Flower[] { rose, jasmine, lily });

		System.out.println("Cost of the bouquet: " + bouquet.calculateCost());
	}
}
