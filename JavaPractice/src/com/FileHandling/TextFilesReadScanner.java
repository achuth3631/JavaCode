package com.FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFilesReadScanner {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./resume1.txt");
		if(!file.exists())
			file.createNewFile();
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
