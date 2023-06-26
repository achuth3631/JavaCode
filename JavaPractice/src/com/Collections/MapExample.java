package com.Collections;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		
		//Creation of map
		Map<Integer, String> mp = new HashMap<Integer,String>();
		
		//Adding elements into the map
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		
		System.out.println(mp);
		System.out.println();
		
		//only you want keys
		Set<Integer> ss = mp.keySet();
		System.out.println(ss);
		
		System.out.println();

		//only you want values
		Collection<String> cc = mp.values();
		System.out.println(cc);
		
		//Deletion of element from map
		mp.remove(1);
		System.out.println(mp);
		
		//If the key is not there we can insert, IF it is there it will not insert
		mp.put(1, "One");
		mp.putIfAbsent(2,"Three");
		
		System.out.println(mp);


		
		
		
	}

}
