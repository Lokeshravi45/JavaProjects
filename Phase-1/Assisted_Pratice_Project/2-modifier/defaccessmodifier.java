package AssistedPractice;

public class defaccessmodifier {
	
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			defaccessmodifier obj = new defaccessmodifier(); 		  
	        obj.display(); 

		}
	}
