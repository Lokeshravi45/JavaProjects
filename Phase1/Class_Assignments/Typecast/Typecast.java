package Typecast;

public class Typecast {

		public static void main(String[] args) {
		
			int i=100;
			long l=i;
			int o = (int) l;
			
			System.out.println("long is--"+l);
			System.out.println("int is--"+o);
			
			char c = (char)o;
			System.out.println("char is--"+c);
			
			double d= (double) c;
			System.out.println("double is--"+d);
			
			float r= (float) d;
			System.out.println("float is--"+r);
			
			double d2= 190675665.2154545326;
			long l2= (long) d2;
			int i2= (int) l2;
			System.out.println("double is---"+d2);
			System.out.println("long is---"+l2);
			System.out.println("int is----"+i2);
			
			float f=l;
			System.out.println("float is---"+f);
			
			byte b;
			int ui =257;
			double d1 =323.142;
			
			System.out.println("coversion of int to byte.");
			b = (byte) ui;
			System.out.println("ii="+ui+"b="+b);
			
			System.out.println("\nconversion of double to byte.");
			
			b =(byte) d1;
			System.out.println("dd="+d1+"b="+b);
		}

	}