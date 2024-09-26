package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {

		List<MyObject> list = new ArrayList<MyObject>();

		list.add(new MyObject("bablu"));
		list.add(new MyObject("ramya"));
		list.add(new MyObject("aarush"));

		MyObject myObject = list.get(2);
		
		System.out.println(myObject);

		for (MyObject onObject : list) {

			System.out.println(onObject);
		}

	}

}
