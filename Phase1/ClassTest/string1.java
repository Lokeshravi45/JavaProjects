package Test;

import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sh=s.nextLine();
		System.out.println(sh.toUpperCase());
		String str=sh.toUpperCase();
		s.close();
		int c=0;
		int L=str.length();
		
		for(int i=0;i<L-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
				c++;
		}
	System.out.println("Double Letters count="+c);
	}
	
}
