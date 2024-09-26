package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetPractices {

	public static void main(String[] args) {

		// Set.of()

		// this is call set static factory method called of()

		// using this Set.of(); we can limit the elements from 0-more

		// Set set = Set.of();

		// with generic

		// Set<String> set = Set.<String>of("abc","bdc","zee"); //unmodifiable set cant
		// add remove elements hahahaha....

		// Add Element to Set

		Set<String> setA = new HashSet<>();
		Set<String> setB = new HashSet<>();
		
		setB.add("sana");
		

		setA.add("bablu");
		setA.add("sana");
		setA.add("aarush");
		setA.add("ramya");

		// Iterate Set Elements

		// Using an Iterator obtained from the Set.
		// Using the for-each loop.
		//Using Java Stream API

		// Using Iterator

		Iterator<String> it = setA.iterator();
		System.out.println("Iterating elemens using Iterator ");
		while (it.hasNext()) {

			System.out.println(it.next());
		}
		
		//using for-each loop
		System.out.println("Iterating elemens using for-each ");
		for(String s:setA) {
			
			System.out.println(s);
		}
		
		//Using Java Stream API
		
	System.out.println("Iterating elements using Java Stream API ");
		
		setA.stream().forEach(s->System.out.println(s));
		
		System.out.println(setA.size());
		
		//Remove Elements From Set
		
		setA.remove("bablu");
		
		System.out.println(setA.size());
		
		//Remove All Elements From Set
		
		//setA.clear();
		
		//Add All Elements From Another Collection
	
		
		//setB.addAll(setA);
		System.out.println(setB);
		// now setB contains setA
		
		//Remove All Elements From Another Collection
		
		setA.removeAll(setB); //elements witch are present in both setB and setA will be removed
		
		System.out.println("removeAll"+setA);
		
		//Check if Set is Empty
		
		System.out.println(setA.isEmpty()); //(or)
		
		System.out.println((setA.size()==0));
		
		//insert null values in set
		
		setA.add(null);
		
		//Convert Java Set to List
		
		//using addAll
		//passing set as argument to list
		//using Stream()
		
		
		setB.add("lucky");
		
		
		
		List<String> list = new ArrayList<>();
		
		//using addAll
		
		list.addAll(setB);
		
		//passing set as argument to lists
		
		List<String> list1 = new ArrayList<>(setB);
		System.out.println(list1);
		
		//using Stream()
		
		List<String> list2 = setB.stream().collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		
		
		
		
		
	}

}
