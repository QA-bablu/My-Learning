package TestNGFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreditCards {

	@Test
	public void visaCards() {
		
		System.out.println("Visa Cards-CreditCards");
	}
	
	@Parameters({"Url"})
	@Test
	public void masterCards(String url) {
		
		System.out.println(url);
		
		System.out.println("Master cards-CreditCards");
	}
	
	@Test
	public void paymentDues() {
		
		System.out.println("Credit cards payments dues-CreditCards");
	}
}