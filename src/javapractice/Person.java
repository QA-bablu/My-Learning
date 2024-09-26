package javapractice;

public class Person {
	
	protected String firstName;
	protected String lastName;
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setFirstName(String fName)
	{
		this.firstName = fName;
	}
	
	public void setLastName(String lName)
	{
		this.lastName = lName;
	}
	
	public String getInfo()
	{
		return "First Name :"+this.firstName+", Last Name :"+this.lastName;
	}

}
