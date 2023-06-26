package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFilesWritingFileOutputStream {
	public static void main(String[] args) throws IOException {

		File file = new File("./resume2.txt");	

		if(!file.exists())
			file.delete();
		file.createNewFile();

		FileOutputStream fos = new FileOutputStream(file);

		fos.write(75);
		fos.write(76);
		fos.write(77);
		fos.write(78);
		fos.write(79);
		fos.write(80);
		
		  
		 
		 String s = "hello";
		  for(char ch : s.toCharArray())
		  {
			  fos.write((int)ch);
		  }
		 
		 
		 
		fos.flush();


	}
}
