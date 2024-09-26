package javapractice;

public class Encp2Runner {

	public static void main(String[] args) {

		EncapsulationExample2 enc = new EncapsulationExample2();
		enc.setBalance(20000);

		System.out.println("Balance : " + enc.getBalance());
		enc.setDeposite(200);
		System.out.println("Deposited Amount :" + enc.getDeposite());
		System.out.println("Balance : " + enc.getBalance());
		enc.setDeposite(3000);
		System.out.println("Deposited Amount :" + enc.getDeposite());
		System.out.println("Balance :" + enc.getBalance());
		enc.setWithdraw(500);
		System.out.println("Withdrawl Amount :" + enc.getWithdraw());
		System.out.println("Balance :" + enc.getBalance());

	}

}
