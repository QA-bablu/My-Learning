package javapractice;

import java.util.ArrayList;
import java.util.Collection;

import org.testng.Assert;

public class ListInterface {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("cherry");
		al.add("mango");
		al.add("apple");

		Collection<String> collect = new ArrayList<>();
		collect.add("jackfruite");
		collect.add("pinapple");
		collect.add("blackberry");
		collect.add("jackfruite");
		
		//all the elements in the collect will be added at the end of the al list
		al.addAll(collect);
		
		al.add(6, "kiwi");

		Assert.assertFalse(al.isEmpty());
		System.out.println(al);
		al.remove(0);
		al.remove("mango");
		System.out.println(al);
		if (al.contains("orange")) {

			System.out.println("orange found");
		} else {
			System.out.println("orange not found");
		}

		System.out.println(al.size());

		for (int i = 0; i < al.size(); i++) {

			System.out.println(i + " : " + al.get(i));
		}

	}

}
