package com.Collections;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>();
		v1.add("a1");
		v1.add(0,"a7");
		
		System.out.println(v1);
		
		Vector<String> v2 = new Vector<String>();
		v2.add("b1");
		v2.add("b2");
		
		//Adding elements from one vector array into aonother
		
		v1.addAll(v2);
		System.out.println(v1);

		//Retrive elements from a list using get()
		System.out.println(v1.get(0));
		
		//Delete elements from the list
		System.out.println(v1.remove("b1"));
		System.out.println(v1.remove(1));
		//System.out.println(v1.removeAll(v2));
		
		//Verification--If the element is present in the list or not
		//contains()  and containsAll()
		
		/*Update--update the old element with with new element without deleting
		          just moving the position  of old element and placing the old
		          element in other position and updating that position with new
		          element */
		v1.set(1, "arr");
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		//If you want to transfer all the vector into array
		    Object[] arr =  v1.toArray();
		    System.out.println(Arrays.toString(arr));
		

	}

}
