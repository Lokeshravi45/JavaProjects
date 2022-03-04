package stringbuffer;

public class Stringbufferexample {

	public static void main(String[] args) {

				StringBuffer s= new StringBuffer("Stared Java ");
				
				s.append("Phase1");
				System.out.println(s);
				
				s.delete(2,5);
				System.out.println(s);
				
				s.replace(9, 15,"Python");
				System.out.println(s);
				
				s.insert(0,"Language ");
				System.out.println(s);
				
				s.reverse();
				System.out.println(s);
				
				System.out.println("Find Character at 9 "+s.charAt(9));
				
			}

	}
