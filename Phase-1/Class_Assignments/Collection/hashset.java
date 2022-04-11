package Collections;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add("e");
		h.add("f");
		h.isEmpty();
	
		
		System.out.println("Hash set...:"+h);
		System.out.println("Hash set size:"+h.size());
		System.out.println("Hashset Empty:"+h.isEmpty());
		System.out.println("Hash set remove:"+h.remove("d"));
		System.out.println("Do variablehash set e element..."+h.contains("e"));
		System.out.println("hash set ..."+h);
		
		h.clone();

	}

}
