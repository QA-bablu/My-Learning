package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TypicalOperationsWithHashMAP {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("A", "bablu");
		map.put("D", "sana");
		map.put("B", "lucky");
		map.put("E", "aarush");
		map.put("C", "riya");
		
		//System.out.println(map.get("C"));
		
		//removing
		
		//map.remove("B");
		
		for(String e:map.keySet())
		{
			System.out.print(e + "->" + map.get(e) + "; ");
		}
			
		System.out.println();
		
		//sorting 
		
		/*Map<String, String> tree = new TreeMap<String, String>(map);
		
		for(Map.Entry<String, String> entry: tree.entrySet())
		{
			System.out.println(entry.getKey() + ":" +entry.getValue() +"; ");
		}*/
		
}
}