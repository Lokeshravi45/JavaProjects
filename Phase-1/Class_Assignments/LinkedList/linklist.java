package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		int a1=12;
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("April");
		ll.add("November");
		System.out.print(ll);
		
		ll.addLast("December");
		
		ll.addFirst("Janauary");
		System.out.println(ll);
		
		ll.add(1,"Febuary");
		ll.add(2,"March");
		System.out.println(ll);
		ll.add(8,"September");
		ll.add(9,"October");
		String q=(String)ll.get(7);
		System.out.println(ll);
		ll.remove(7);
		ll.add(3,q);
		
		Iterator itr=ll.listIterator();
		while(itr.hasNext()){
			System.out.println("List is "+itr.next());
		}
		System.out.println("Linked list Size "+ll.size());
		for(int i=0;i<ll.size();i++)
		{
			if(i%2==0)
				System.out.println(ll.get(i));
		}
		for(int i=0;i<ll.size();i++)
		{
			if(i%2!=0)
				System.out.println(ll.get(i));
		}
ll.iterator().forEachRemaining(e->System.out.println(e));
System.out.println(ll.get(11));
ll.remove("my brith month is may"+ll.remove("May"));
System.out.println("December");
System.out.println(ll.peekFirst()+" "+ll.peekLast());
System.out.println(ll.pollFirst()+" "+ll.pollLast());
System.out.println(ll);
	}
	}


