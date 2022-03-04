package com.PracticeProject;

import java.io.FileReader;
import java.io.IOException;

public class Filehandlingread 
{
public static void main(String[] args){
		                         //Reading an Existing file
		 try
		 {
		 FileReader fr = new FileReader("C:\\Users\\Lokesh\\Desktop\\Filehandling\\test.txt");
		 try
		 {
		 int i;
		while((i=fr.read())!=-1)
		 {
		 System.out.print((char)i);
		 }
		 }
		 finally
		 {
		 fr.close();
		 System.out.print("\n");
		 System.out.print("File Closed successfully.");
		 }
		 }
		 catch(IOException e)
		 {
		 System.out.println("Exception handled..");
		 }
		 }

		 
}
		 
		 