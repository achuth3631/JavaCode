package com.Collections;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> book = new Stack<String>();
		book.add("Two");
		book.add("Three");
		book.add(0,"One");
		book.push("four");
		
		System.out.println(book.peek());
		//System.out.println(book.pop());  //remove the element
		System.out.println(book);
		System.out.println(book.search("One"));
		
	}

}
