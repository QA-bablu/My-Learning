package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterating {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "bablu");
		map.put(103, "ramya");
		map.put(104, "sana");
		map.put(102, "lucky");

		//Iterating map key and values by using map.keyset() method
		
		/*map.keySet();
		for (Integer key : map.keySet()) {
			// prints in ascending order by default
			System.out.println(key + " " + map.get(key));

		}*/
		
		//Iterating map key and values by using map.entrySet() method
		
		/*for(Map.Entry<Integer, String> e: map.entrySet())
		{
			System.out.println(e.getKey() +" -> "+e.getValue());
			
		}*/
		
		
		//Iterating map key and values by using Iterator() method
		Iterator<Map.Entry<Integer, String>> it= map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
