package Collections;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		
		s.add("w");
		s.add("h");
		s.add("a");
		s.add("t");
		s.add("123");
		s.add("r");
		s.add("e");
		s.add("d");
		s.add("o");
		s.add("i");
		s.add("n");
		s.add("g");
		
		System.out.println("Linked hashset"+s);
		System.out.println("Linked hashset:"+s.size());
		System.out.println("LinkedHashset Empty:"+s.isEmpty());
		System.out.println("Hash set remove:"+s.remove("d"));
		System.out.println("Do variablehash set e element..."+s.contains("e"));
		System.out.println("Linked hashset hashcode.."+s.hashCode());
		System.out.println("Linkedhash set ..."+s);
		
		
     
	}

}
