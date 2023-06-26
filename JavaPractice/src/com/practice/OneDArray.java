package com.practice;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array : ");

		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();

		int[] array = new int[size];



		/*i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=100; */

		System.out.println("Enter the elements of an array: ");

		for(int i=0; i<size;i++) {

			System.out.println("enter element at index "+i+" is : ");	

			array[i] = scn.nextInt();
			
			
		}
		
		int sum =0;
		
		for(int i=0; i<size;i++)
		{
			sum += array[i];
		}
		System.out.println(sum);


		scn.close();
	}

}
