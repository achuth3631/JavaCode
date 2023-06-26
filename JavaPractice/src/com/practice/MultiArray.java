package com.practice;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter  the size of rows you want :");
		int rows = scn.nextInt();
		System.out.println("Enter the size of columns you want:");
		int columns = scn.nextInt();

		int[][] arr = new int[rows][columns]; 

		System.out.println("Enter the elements of an array : ");

		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns;j++)
			{
				System.out.println("Enter the element at position at "+i+" row and "+j+" column");
				arr[i][j] = scn.nextInt();
			}
		}

		//calculate the sum of elements of an array

		int sum =0;

		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				sum +=arr[i][j];
			}
		}

		//Total sum of elements in the array are :

		System.out.println("Total sum of elements in the array are:" + sum);






		scn.close();

	}



}
