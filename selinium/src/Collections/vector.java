package Collections;

import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		Vector <Integer>vc=new Vector<Integer>();
		
		vc.add(1);
		vc.add(2);
		vc.add(3);
		vc.add(4);
		vc.add(5);
		vc.add(6);
		vc.add(7);
		vc.add(8);
		
		System.out.println(vc);
		System.out.println("Size of vector cv is-:"+ vc.size());
		
		System.out.println("first element of vector cv is-:"+vc.firstElement());
		System.out.println("last element of vector cv is-:"+vc.lastElement());
		System.out.println("current capacity  of vector cv is-:"+vc.capacity());
		System.out.println("object at the specified index of vector cv is-:"+vc.get(5));
		System.out.println("index the index of the element to be removed of vector cv is-:"+ vc.remove(3));
		System.out.println(vc);
		
		System.out.println("Reading element using forloop");
		for(int i=0;i<vc.size();i++){
			System.out.println(vc.get(i));
			System.out.println();
			
			System.out.println("Reading element using for each loop");
			
			for(Object obj:vc) {
				System.out.println(obj);
				
				System.out.println("Reading element using for each loop");
				
				System.out.println("Reading element using iterator");
				
				Iterator ite= vc.iterator(); 
				
				while(ite.hasNext()) {
					System.out.println(ite.next());
				}
					
				
				}
			
			
		}
	}
	
	

}
