package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("abc");
		al.add('A');
		System.out.println(al);
			
		//Add Elements Based On Existing Index
		al.add(2, 50);
        System.out.println(al);
        
        //Set Method For Replacement
        al.set(2, "XYZ");
        System.out.println(al);
        
        //To Remove Elements From Respective Position
        al.remove(3);
        System.out.println(al);
        
        //Checking The Emptiness oF ArrayList
        
        System.out.println("Is ArrayList Is Empty:" +al.isEmpty());
        //Checking the size of ArrayList
        System.out.println("Size Of ArrayList is:" +al.size());
        System.out.println("Index Of abc Is:" +al.indexOf("abc")); 
        al.add("abc");
        System.out.println(al);
        System.out.println("LastIndex Of abc Is:" +al.lastIndexOf("abc"));
	    System.out.println("Is List Contains 20:"+al.contains(20));
	    System.out.println("Is List Contains Null:"+al.contains(null));
	    System.out.println("It Contains get:" +al.get(2));
	    
	    /*//Regular For Loop
	    for(int i=0;i<al.size();i++)
	    {
	    	System.out.println("" +al.get(i));
	    	
	    }
	    //Advanced For Loop
	    for(Object value:al)
	    {
	    	System.out.println(value);
	    	
	    }*/
	    //Iterator
	    //Declaring the Iterator
	    //For any class in Collection
	    
	    /*Iterator itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }*/
	    
	  //ListIterator   
	   //Only For List Interfaces Classes
	    ListIterator litr=al.listIterator();
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    //Reverse The ArrayList
	    Collections.reverse(al);
	    System.out.println(al);
	   Iterator itr=al.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	    
	}
	

}
