package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {
		LinkedHashSet is=new LinkedHashSet();
		is.add(1);
		is.add(3);
		is.add("abc");
		is.add("bcd");
		is.add('a');
		System.out.println(is);
		
		
		//add Duplicate
		is.add("abc");
		is.add("bcd");
		System.out.println("Duplicate Value is "+is);
        
		//Size Of Elements
		System.out.println("Size Of LinkedHasgSet is" +is.size());
		System.out.println("LinkedHashSet Contains "  +is.contains("abc"));
		System.out.println("LinkedHashSet Contains "  +is.contains("pqr"));
        is.remove('a');
        System.out.println(is);
        System.out.println("The Elements For Removal is"  +is.remove("abc"));
        Iterator itr=is.iterator();
        while(itr.hasNext())
        {
          System.out.println(itr.next());	
        }
        		
	}
	
	
	

}
