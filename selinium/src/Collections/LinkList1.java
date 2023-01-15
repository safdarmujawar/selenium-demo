package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkList1 {

	public static void main(String[] args) {
		
		LinkedList LL= new LinkedList();// hetro
		//
		LinkedList<String> LL1= new LinkedList();// homo
		
		// Add/inserting element into Linked list
				LL.add(300);
				LL.add("LinkedList");
				LL.add(30.4);
				LL.add('A');
				LL.add(null);
				LL.add(true);
				LL.add(null);
				
				System.out.println(LL);
				
				//size
				
				System.out.println(LL.size());
				
				//  LL.remove(300);
					System.out.println(LL);
					
					LL.add(400);
					
					// 3. Add element in the middile of ll
					
					LL.add(3, "Python");
					System.out.println(LL);
					
					//4. get() - Returns the element at the specified position
					
					System.out.println(LL.get(4));
					
					//firstindex 
					
					System.out.println(LL.getFirst());
					
					//Lastindex
					System.out.println(LL.getLast());
					
					//7.Set();
					
					LL.set(5, false);
					System.out.println(LL);
					
					//isempty
					
					System.out.println(LL.isEmpty());
					System.out.println(LL1.isEmpty());
					
					//9.Contains
					
					System.out.println(LL.contains("Python"));
					System.out.println(LL.contains("Java"));
					
					System.out.println();
					System.out.println("Reading element using for loop");
					
					for(int i=0;i<LL.size();i++) {
						
						System.out.println(LL.get(i));
						
					}
					
					System.out.println();
					System.out.println("Reading element using for each loop");

					for(Object obj : LL) {
						System.out.println(obj);

					}
					
					System.out.println();
					System.out.println("Reading element using iterator");
					
					Iterator  it = LL.iterator();
					
					while(it.hasNext()) {
						
						System.out.println(it.next());
						}
				

	}

}
