package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TypicalOperationsWithArrayList {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("D");
		list.add("E");
		list.add("C");
		list.add("B");
		
		//print element as per the indext
		System.out.println(list.get(3));
		
		//remove lement as per the index
		list.remove(2);
		
		//Collections.sort(list);
	Collections.sort(list,Collections.reverseOrder());		
		
		Iterator<String> it =list.iterator();	
		
		while(it.hasNext())
		{
			System.out.println(it.next()+ " ");
		}
	}

}
