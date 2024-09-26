package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {
	
	public static void main(String[] args) {
			
		Map<Integer, String> mp = new HashMap<>();
		
		mp.put(3, "bablu");
		mp.put(4, "bablu");
		mp.put(6, "sana");
		mp.put(8, "aarush");
		mp.put(7, "ramya");
		mp.put(null, null);
		mp.put(null, null);
		
		System.out.println(mp.get(7));
		// print map object
		
		
		
		System.out.println(mp);
		
		// get value of specified key
		System.out.println(mp.get(6));
		
		//check map is empty
		System.out.println(mp.isEmpty());
		
		//check whether the value is present in map
		System.out.println(mp.containsValue("ramya"));
		
		//iterating map key and values using entrySet().iterator()
		
		Iterator<Entry<Integer, String>> it = mp.entrySet().iterator();
		while(it.hasNext()) {
			
			Map.Entry<Integer, String> entry = it.next();
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		//iterating map key and values using entrySet() and foreach
		
		for(Map.Entry<Integer, String> entry :mp.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		//iterating map key and values using keySet() and foreach
		
		
		for(Integer key:mp.keySet()) {
			
			System.out.println(key+" : "+mp.get(key));
		}
	}

}
