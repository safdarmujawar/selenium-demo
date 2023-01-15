package Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertArrayIntoArrayList {

	public static void main(String[] args) {
		
	 String A[]= {"cat" ,"dog", "elephant"};
	 
	 for (String name:A) {
		 
		 System.out.println(name);
		 
	 }
	 
	 // convert array into arraylist
	 
	 ArrayList AL=new ArrayList(Arrays.asList(A));
	 System.out.println(AL);

	}

}
