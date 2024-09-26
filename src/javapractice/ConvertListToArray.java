package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		
		List<String> elements = new ArrayList<String>();
		elements.add("A");
		elements.add("B");
		elements.add("C");
		
		String [] arr = new String [elements.size()];
		arr = elements.toArray(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
