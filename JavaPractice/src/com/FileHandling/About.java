package com.FileHandling;

public class About {

}

/* 
--> four ways we can read a data from text file.
  1.FileInputStream--read--char by char read
  
    FileInputStream file = new FileInputStream(FileName);
    
  2.Scanner--hasNextLine,NextLine--line by line read--
             we can use only read the data and we can't write the data.
  
    Scanner sc = new Scanner(file);
    
  3.FileReader--read --char by char read
  
    FileReader fr = new FileReader(file);
    
  4.BufferedReader--read--line by line read
    
    BufferedReader br = new BufferedReader(file);
    
    
-->3 ways we can write a data into the text file
   1.FileOutputStream--fos.write();
   
     FileOutputStream fos = new FileOutputStream(file);
     
   2.FileWriter
   3.BufferedWriter
 
  */
