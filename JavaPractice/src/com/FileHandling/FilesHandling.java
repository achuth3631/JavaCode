package com.FileHandling;

import java.io.File;
import java.io.IOException;


//If you are handling with files,must add throw exception

public class FilesHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\New\\resume.txt");
		if(f.exists())
			f.delete();
		System.out.println(f.createNewFile());
		f.isHidden();
		
	}

}
