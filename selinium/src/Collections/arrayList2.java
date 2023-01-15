package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("D");
		al.add("A");
		al.add("C");
		al.add("B");
		
		System.out.println(al);
		
		ArrayList duplicate=new ArrayList();
		
		//add all
		duplicate.addAll(al);
		System.out.println(duplicate);
		
		//remove all
		duplicate.removeAll(al);
		System.out.println("after removing all"+ duplicate);
		System.out.println(duplicate.isEmpty());
		
		//collection method
		System.out.println("all elements in arraylist"+al);
		Collections.sort(al);
		System.out.println("after sorting arraylist"+al);
		
	    Collections.sort(al,Collections.reverseOrder());
     	System.out.println("reverse order"+al);
	
	    Collections.shuffle(al);
	    System.out.println(al);

	}

}
