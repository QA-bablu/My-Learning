package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListPractices {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// Insert Elements in a Java List

		list.add("element 1");
		list.add("element 3");
		list.add("element 1");

		// Insert null Values

		list.add(null);

		// Insert Elements at Specific Index

		list.add(4, "ramya");

		for (String item : list) {

			System.out.println(item);
		}

		System.out.println(list.size());

		List<String> list2 = new ArrayList<>();

		// Insert All Elements From One List Into Another

		list2.addAll(list);
		list2.add("element 1");

		list2.add("element 1");
		System.out.println(list2);

		// Get Elements From a Java List

		System.out.println(list2.get(3));

		System.out.println(list2);

		// Find Elements in a List

		// indexOf()

		System.out.println(list2.indexOf("ramya"));

		// lastIndexOf() - method finds last occurance of that element

		// "element 1" occurs in 3 times lastIndex is 6

		System.out.println(list2.lastIndexOf("element 1"));

		// Checking if List Contains Element

		System.out.println(list.contains("element 1"));
		System.out.println(list.contains(null));

		// Remove Elements From a Java List

		// remove(Object element)
		// remove(int index)

		list2.remove(1);

		System.out.println(list2);

		list2.remove("ramya");

		System.out.println(list2);

		System.out.println(list2);
		System.out.println(list);

		list2.addAll(list);

		System.out.println(list2);
		System.out.println(list);

		// Retain All Elements From One List in Another

		List<String> source = new ArrayList<>();
		source.add("book1");
		source.add("book2");
		source.add("book3");
		List<String> dest = new ArrayList<>();
		dest.add("book3");

		source.retainAll(dest); // source contains elements which are present in both source and dest
		

		System.out.println("elements which are present in both source and dest lists"+source);

		// Remove All Elements From a Java List

		dest.clear();

		System.out.println(dest);

		// Sublist of List

		System.out.println(source);

		System.out.println(source.subList(0, 2)); // which includes 0 and 1 index but excludes 2

		System.out.println(source);

		// Convert List to Array

		Object[] arr = source.toArray();

		System.out.println(arr[2]);

		// Convert a List to an array of a specific type

		String[] ar = source.toArray(new String[0]);
		// if we pass a String array of size 0 to the toArray(),
		// the array returned will have all the elements in the List in it. It will have
		// the same number of elements as the List.

		System.out.println(ar.length);

		// Convert Array to List

		String[] al = new String[3];
		List<String> aList = Arrays.asList(al);

		// Sort List

		// If the List contains objects that implement the Comparable interface
		// (java.lang.Comparable),
		// then the objects can compare themselves to each other. In that case you can
		// sort the List like this:
		// Sort List of Comparable Objects

		List<String> sortedList = new ArrayList<>();
		sortedList.add("y");
		sortedList.add("z");
		sortedList.add("f");
		sortedList.add("e");
		System.out.println("Before sort " + sortedList);

		// Java String class implements the Comparable interface, you can sort them in
		// their natural order, using the Collections sort() method.

		Collections.sort(sortedList);
		System.out.println(sortedList);

		List<Car> car = new ArrayList<>();

		car.add(new Car("AUDI", "TS 04 EE 8017", 4));
		car.add(new Car("HONDA", "AP 09 DG 8017", 3));
		car.add(new Car("BENZ", "TN 20 OI 8017", 5));
		car.add(new Car("BMW", "KL 07 NH 8017", 6));

		Comparator<Car> carBrandComparator = new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {

				return car1.brand.compareTo(car2.brand);
			}

		};

		Collections.sort(car, carBrandComparator);
		
		
		//it is possible to implement a Comparator using a Java Lambda
		
		Comparator<Car> carBrandComptor = (car1,car2)->car1.brand.compareTo(car2.brand);
		
		Comparator<Car> carNumbrPlatComptor = (car1,car2)->car1.numberPlate.compareTo(car2.numberPlate);
		
		Comparator<Car> carNoOfDoorsComptor = (car1,car2)->car1.noOfDoors-car2.noOfDoors;
		
		Collections.sort(car,carBrandComptor);
		Collections.sort(car,carNumbrPlatComptor);
		Collections.sort(car,carNoOfDoorsComptor);
		
		
		//Iterate List
		
		//You can iterate a Java List in several different ways. The three most common ways are:

			//Using an Iterator
			//Using a for-each loop
			//Using a for loop
			//Using the Java Stream API
		
		
		//Using an Iterator
		
		/*Iterator<String> it = sortedList.iterator();
		
		while(it.hasNext()) {
			
			System.out.print(it.next()+" ");
			
			
		}*/
		
		//Using a for-each loop
		
		/*for(String s:sortedList) {
			
			System.out.print(s+" ");
		}*/
		
		//using for loop
		
		/*for(int i=0;i<sortedList.size();i++) {
			
			System.out.print(sortedList.get(i)+" ");
			
		}*/
		
		//using Stream Api
		
		sortedList.stream().forEach(s->System.out.print(s+" "));
		
		
		
		

	}

}
