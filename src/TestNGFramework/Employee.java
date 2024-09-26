package TestNGFramework;

public class Employee {
	
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		
		this.eno=eno;
		this.ename=ename;
	}
	
	public String toString() {
		return "Emplyee[eno=" + eno + ",ename=" + ename + "]";
	}

}
