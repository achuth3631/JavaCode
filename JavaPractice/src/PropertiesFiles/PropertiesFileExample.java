package PropertiesFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class PropertiesFileExample {
public static void main(String[] args) throws IOException {
	File file = new File("DBConfig");
	
	if(!file.exists())
		file.createNewFile();
	System.out.println(file.exists());
	
	//If you want to set the values by using FileOutputStream by developer.
	
	Properties prop = new Properties();
	prop.setProperty("url", "Localhost");
	prop.setProperty("username", "arr123");
	prop.setProperty("password", "Achuth123");
	
	FileOutputStream fos = new FileOutputStream(file);
	
	prop.store(fos, "New Prop file is created");
	
	
	//Print all the keys 
	
   Set<String> keyss=   prop.stringPropertyNames();
   System.out.println(keyss);
   
	
	
}
}
