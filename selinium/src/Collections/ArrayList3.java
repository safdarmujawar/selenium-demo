package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
	String arr []  = {"Cat", "Dog","Elephant"};
		
		for(String name: arr) {
			
			System.out.println(name);
		}
		//Convert array into array list
		
		ArrayList AL  =new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
	}

}
