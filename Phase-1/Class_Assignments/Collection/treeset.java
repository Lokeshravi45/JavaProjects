package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		System.out.println("Enter the input");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		String s4=sc.next();
		String s5=sc.next();
		String s6=sc.next();
		
		
		ts.add(s1);         //used for print all ts 
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		
		System.out.println("Tree set"+ts);
		//System.out.println("Remove the"+ts.remove("css"));
		//System.out.println("Remove the"+ts.remove("c"));
		ts.remove(s2);
		ts.remove(s3);
		System.out.println("Tree set"+ts);
		
		System.out.println("add"+ts.add("sql")+ts.add("c#")+ts.add("swift"));
		//System.out.println("Tree set"+ts);
		System.out.println("checking the java is part or not"+ts.contains("java"));
		ts.remove(ts);
		System.out.println("after last opertion:"+ts);
		
		
		sc.close();
		
		

	}

}
