package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunTimePoly {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("ravi");
		list.add("veera");
		list.add("raj");
		
		/*Iterator <String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println("Name in the list are "+it.next());
		}
		*/
		
		for(String name:list)
		{
			System.out.println("Name in the list are "+name);
		}
	}

}
