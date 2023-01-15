package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ollection_ArrayList {

	public static void main(String[] args) {
		ArrayList Al1=new ArrayList();
		ArrayList al=new ArrayList();
		al.add(false);
		al.add(100);
		al.add("velocity");
		al.add(24.5);
		al.add('a');
		al.add(200);
		
		System.out.println(al);
		
		System.out.println("size of array al is:-"+al.size());
		
		System.out.println(al.contains("arraylist al contains string velocity"+"velocity"));
		//REMOVE METHOD
		 
		al.remove(1);
		System.out.println(al);
		
		//add or insert new element method
		
		al.add(1, 100);
		System.out.println(al);
		
		//get index method
		
		System.out.println(al.get(5));
		
		//retrive specific element
		
		System.out.println(al.get(4));
		
		//  change or replace
		
		al.set(5, 20);
		
		System.out.println(al);
		
		// is empty method
		
		System.out.println(al.isEmpty());
		System.out.println(Al1.isEmpty());
		System.out.println();
		// reading array by for loop
		
		for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
			System.out.println();
			//reading array by for each loop/or advance for loop
			
			for(Object a:al) {
				
				System.out.println(a);
				System.out.println();
				
				System.out.println("reading arraylist by using iterator");
				Iterator it=al.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
