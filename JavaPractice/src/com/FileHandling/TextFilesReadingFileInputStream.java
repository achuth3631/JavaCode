package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFilesReadingFileInputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("./resume1.txt");
		if(!file.exists())
			file.createNewFile();

		FileInputStream fis = new FileInputStream(file);
		int ascii;
		String text="";
		while((ascii=fis.read()) != -1)
		{
			text += String.valueOf((char)fis.read());
			System.out.print((char)fis.read());
		}
		System.out.println(text);
		fis.close();
	}

}
