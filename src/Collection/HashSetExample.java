package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet <String> hs=new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("One");
		hs.add(null);
		System.out.println(hs);
		ArrayList <String> al=new ArrayList <String>();
		al.add("Five");
		al.add("Six");
		al.add("Seven");
		al.add("Eight");
		al.add("Nine");
		al.add("Ten");
		System.out.println(al);
		hs.addAll(al);
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}
 
}
