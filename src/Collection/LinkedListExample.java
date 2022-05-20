package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList ll=new ArrayList();
		ll.add(15);
		ll.add("ABC");
		ll.add('C');
		ll.add(15);
		//To See Elements
		System.out.println(ll);
		ll.add(2,"PQR");
		System.out.println(ll);
		//Contains Method
		System.out.println("Contains Method :"  +ll.contains('z'));
		System.out.println("Contains Method :"  +ll.contains('C'));
		ll.remove("PQR");
		System.out.println(ll);
		//Checking The Size Of ArrayList
		System.out.println("The Size Of ArrayList:"  +ll.size());
		System.out.println(ll.get(1));
		System.out.println(ll.get(3));
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//getfirst,getlast,first,addLast,RemoveFirst,RemoveLast
		 
		/*System.out.println(ll.get);
		System.out.println("the first element is " + ll.getLast());
		ll.getFirst("Java");
		ll.getLast("Python");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll)*/
		
		
		
		
		
		
		
	}
	

}
