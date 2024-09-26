package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new MyObject(" "));
		
		MyObject myObject = (MyObject) list.get(0);
		
		for(Object onObject : list) {
			
			MyObject theObject = (MyObject) onObject;
			
			
		}
	}

}
