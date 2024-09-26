package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import ListInterface.MyObject;

public class MapPractice {

	public static void main(String[] args) {

		// Create map

		Map map1 = new HashMap();

		// Generic Map , it helps you to avoid inserting wrong object types and
		// teammates can easily understand the which object types are stored throught
		// the map

		Map<String, MyObject> map = new HashMap<String, MyObject>();

		for (MyObject object : map.values()) {

		}

		for (String key : map.keySet()) {

			MyObject value = map.get(key);

		}

		// http://tutorials.jenkov.com/java-collections/map.html

		Map<String, String> mp = new HashMap<>();

		Map<String, String> mpB = new HashMap<>();
		mp.put("TS", "Hyd");
		mp.put("AP", "Amaravathi");
		mp.put("KL", "Kochi");
		mp.put("TN", "Chennai");

		// Null Keys

		mp.put(null, "null key");
		// String value = map.get(null);

		// Null values

		mp.put("Delhi", null);
		// String value = map.get("Delhi");

		// Null key and values
		mp.put(null, null);
		// String value = map.get(null);

		// String value = map.get(null);

		// Inserting All Elements From Another Map

		mpB.putAll(mp);

		// Get Elements From a Java Map

		System.out.println(mpB.get("TN"));

		// Get or Default Value

		String value = mp.getOrDefault("TS", "MySORE");

		System.out.println(value);

		System.out.println(mp);

		// Checking if Map Contains Key

		System.out.println("is key present " + mp.containsKey("TI"));

		// Checking if Map Contains Value

		System.out.println("is value present " + mp.containsValue("hyd"));

		// Iterating the Keys of a Java Map

		// using for-each keySet
		System.out.println("Using for-each keySet()");
		for (String key : mp.keySet()) {

			System.out.println(key + mp.get(key));

		}

		// Using an Entry For-Each Loop
		System.out.println("for-each entrySet");
		for (Entry<String, String> entry : mp.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Using an Entry Iterator

		Iterator<Entry<String, String>> it = mp.entrySet().iterator();
		System.out.println("Using iterator entryset ");
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();

			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		
		Iterator<String> it1 = mp.keySet().iterator();
		System.out.println("Using iterator keySet()");
		while(it1.hasNext()) {
			
			String key = it1.next();
			System.out.println(key+mp.get(key));
		}
		
		System.out.println("Using Stream API");
		mp.keySet().stream().forEach(ky->System.out.println(ky+" : "+mp.get(ky)));
		
		// Iterating the Values of a Java Map
		
		
		//using for-each
		
		for(String valu :mp.values()) {
			
			System.out.println(valu);
		}
		
		//using Iterator
		
		Iterator<String> itr = mp.values().iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		//Using Stream Api
		
		mp.values().stream().forEach(s->System.out.println(s));
		
		//Removing Entries From a Java Map
		
		mp.remove("TN"); // remove using object key
		
		System.out.println(mp);
		
		System.out.println(mp.remove("KL", "Kochi")); // remove object by key and value
		
		System.out.println(mp);
		
		//Removing All Entries
		
		//mp.clear();
		
		//Replacing an Entry in a Java Map
		
		mp.replace("TS", "null"); // value will be changed for the given key
		
		System.out.println(mp);
		
		mp.replace("TS", "null", "Hyderabad"); //  replace the old value with new value for that key
		
		System.out.println(mp);
		
		mp.replaceAll((k,v)->v); // repleces the key or value for enrie map
		System.out.println(mp);
		
		//Reading Number of Entries in Map
		
		mp.size();
		System.out.println(mp.size());
		
		//Checking if a Java Map is Empty
		
		mp.isEmpty();
		
		//Functional Operations in Java Map
		
		//compute()- we can perform some operations on value and key
		
		mp.compute("Delhi", (k,v)->
		v==null?"Delhi":v);
		
		mp.compute("Delhi",(k,v)->
		v==null?null:v.concat("- India's Capital City"));
		

		System.out.println(mp);
		
		//computeIfAbsent()
		
		mp.computeIfAbsent("Delhi", k->"HYD");
		 
		System.out.println(mp);
		
		//computeIfPresent()
		
		mp.computeIfPresent("AP", (k,v)->
		v==null?null:v.toString().toUpperCase());
		
		System.out.println(mp);
		
		//merge()
		
		mp.merge(null, "Unknown state",
				(oldValue,newValue)->oldValue+"-abc"
		);
		
		System.out.println(mp);
	}

}
