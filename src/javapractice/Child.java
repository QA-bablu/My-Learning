package javapractice;

public class Child extends Person{
	
	private Person mother;
	private Person father;

	public Child(String firstName, String lastName) {
		super(firstName, lastName);
		
	}
	
	public Child(String firstName, String lastName,Person mother, Person father) 
	{
		super(firstName, lastName);
		this.father = father;
		this.mother = mother;
	
	}
	
	public Person getMother()
	{
		return mother;
	}
	
	public Person getFather()
	{
		return father;
	}
	
	public void setMother(Person motherName)
	{
		this.mother = motherName;
	}
	
	public void setFather(Person fatherName)
	{
		this.father = fatherName;
	}
	
	public String getInfo()
	{
		return super.getInfo()
				+"\n Mother : "+this.mother.getInfo()
				+"\n Father : "+this.father.getInfo();
	}
}
