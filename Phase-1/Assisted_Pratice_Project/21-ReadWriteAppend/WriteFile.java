package AssistedPractice;

import java.io.FileWriter;

public class WriteFile {
		  public static void main(String args[]) {

		    String data = "This is the data in the output file";
		    
		    try {
		      // Step 1: Creates a Writer using FileWriter
		      FileWriter output = new FileWriter("C:\\Users\\Lokesh\\Desktop\\tes.txt");
		      // Step 2: Writes string to the file
		      output.write(data);
		      System.out.println("Data is written to the file.");

		      // Step 3: Closes the writer
		      output.close();
		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }
		 }
		}
