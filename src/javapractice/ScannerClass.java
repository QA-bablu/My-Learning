package javapractice;

public class ScannerClass {

	private int value;
	
	public ScannerClass(int value)
	{
		this.value = value;
	}
	
	public int sum()
	{
		int result = 0;
		for(int i=0;i<=this.value;i++)
		{
			result +=i;
		}
		return result;
	}
	
	public int factorial() {
		
		int result =1;
		for(int i=1;i<=this.value;i++)
	{
		result*=i;
	}
		return result;
}}
