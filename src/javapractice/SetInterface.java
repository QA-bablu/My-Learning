package javapractice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> st = new HashSet<>();
		
		Collection<String> collect = new HashSet<>();
		
		collect.add("India");
		collect.add("Bangladesh");
		collect.add("America");
		collect.add("Canada");
		collect.add("Sri Lanka");
		collect.add("Bangladesh");
		collect.add("Iceland");
		
		Iterator<String> it= st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		st.addAll(collect);
	
		System.out.println(st);
		
		System.out.println(st);
	}

}
