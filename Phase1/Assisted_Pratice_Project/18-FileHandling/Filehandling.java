package com.PracticeProject;

import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
		 public static void main(String[] args){
		 //Writing in the file

		 try
		 {
		FileWriter fp = new FileWriter("C:\\Users\\Lokesh\\Desktop\\Filehandling\\test.txt");
		 try
		 {
		 fp.write("Rohit is good boy..!");
		 }
		 finally
		 {
		 fp.close();
		 }
		 System.out.println("Successfully Written.");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 }

		 }
		}
