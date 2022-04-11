package com.PracticeProject;

import java.io.FileWriter;
import java.io.IOException;

public class FilehandlingAppend {                             // Append text to Existing File.
	 public static void main(String[] args){ 
	 String path = "C:\\Users\\Lokesh\\Desktop\\Filehandling\\test.txt";
	 String text = "Hi how are you";
	 try
	 {
	 FileWriter fa = new FileWriter(path,true);
	 fa.write(text);
	 fa.close();
	 System.out.println("Append done Successfully..");
	 }
	 catch(IOException e){
	 System.out.println(e);
	 }
	 }
	}

