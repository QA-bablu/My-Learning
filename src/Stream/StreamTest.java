package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		
		al.add("ramya");
		al.add("aablu");
		al.add("aarush jai");
		al.add("lucky");
		
		
		//List<String> newAl = al.stream().filter((s)->s.length()>4).collect(Collectors.toList());
		
		//al.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//al.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));	
		
		//al.stream().filter(s->s.length()>4).limit(2).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//al.stream().filter(s->s.startsWith("r") && s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//al.stream().filter(s->s.length()>4 && s.startsWith("a") && s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		al.stream().filter(s->s.startsWith("a")).sorted().forEach(s->System.out.println(s));
		
		
		
		

	}
}
