package assignment;

import java.util.Arrays;

import.java.util.*;
public class Tester {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("rick");
		list.add("rtfick");
		list.add("riygyck");
		list.add("richythgk");
		list.add("Carl");
		/*list.forEach(
				
				(names)->{System.out.println(names);}
	);
			list
			.stream()
			.filter(s->s.startWith("C"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println); */
		
		Stream.of("a1","a2","a3")
		.findFirst()
		.ifPresent(system.out::println);
		
		Arrays.stream(new int[] {1,2,3})
		.flatMap(n->2*n+1)
		.average()
		.ifPresent(System.out::println);
	}

}
