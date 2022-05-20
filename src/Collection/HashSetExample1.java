package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {
		HashSet <String> sh=new HashSet <String>();
		//To Add Elements
		sh.add("One");
		sh.add("Two");
		sh.add("Three");
		sh.add("Four");
		sh.add("Five");
		System.out.println(sh);
		sh.add("one");
		sh.add("Two");
		sh.add("Three");
		sh.add("Four");
		System.out.println(sh);
		sh.add(null);
		sh.add(null);
		System.out.println(sh);
		
		//To Add ArrayList Into Set
		ArrayList<String> al=new ArrayList<String>();
		al.add("Three");
		al.add("Five");
		al.add("Six");
		al.add("Seven");
		System.out.println(al);
		sh.addAll(al);
		System.out.println(sh);
		al.addAll(sh);
		System.out.println(al);
		sh.remove("Five");
		System.out.println(sh);
		
		System.out.println(sh.contains("Three"));
		
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Three");
		al1.add("Five");
		al1.add("Six");
		al1.add("Seven");
		System.out.println(al1);
		
		
		System.out.println( "Updayed ContainsAll Functions"+al1.containsAll(sh));
		
		
		
		Iterator itr=sh.iterator();
		while(itr.hasNext())
		{
			System.out.println("To Read Value" +itr.next());
		}
		System.out.println(sh.isEmpty());
		System.out.println(sh.size());
			
		}
		
		
	
		
		
		

	}


