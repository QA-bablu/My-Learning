package javapractice;

public class EncapsulationExample {
	
	/**
	 * Encapsulation means grouping the fields and methods
	 * Encapsulation =datahiding + abstraction
	 * in encapsulation we user cant access fields directly with help of getter and setter methods can access
	 */
	
	private String name;
	private int age;
	private String id;
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
	{
		age=newAge;
	}
	
	public void setId(String newId)
	{
		id = newId;
	}

}
