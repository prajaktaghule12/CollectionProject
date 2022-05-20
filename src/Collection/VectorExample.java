package Collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector vc=new Vector();
		vc.add("PQR");
		vc.add('A');
		vc.add(2);
		vc.add("Pune");
		vc.add("Delhi");
		vc.add(1000);
		System.out.println(vc);
		System.out.println(vc.capacity());
		vc.add("xyz");
		System.out.println(vc);
		vc.set(2, "abc");
		System.out.println(vc);
		vc.remove(2);
		System.out.println(vc);
		System.out.println("Checking The Emptiness Of Vector:"+ vc.isEmpty());
        System.out.println("Checking TheSize Of Vector:" +vc.size());
        System.out.println("Checking The Index Of Vector:" +vc.indexOf("Pune"));
	}

}
