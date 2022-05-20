package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<String>car=new ArrayList<String>();
		car.add("Volkswagon");
		car.add("Bullet");
		car.add("Audi");
		car.add("Mercedz Benz");
		car.add("Activa");
		//ArrayList Before Sorting
		System.out.println(car);
		Collections.sort(car);
		System.out.println("Collections Before Sorting:"+car );
		Collections.sort(car, Collections.reverseOrder());
		System.out.println("Collections After Sorting :" +car);
		
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(70);
		al.add(100);
		al.add(1000);
		al.add(90);
		System.out.println(al);
		//Ascending SSorting
		Collections.sort(al);
		System.out.println(al);
		//Reverse Order Sorting
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		
		
		
		

	}

}
