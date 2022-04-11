package Test;

import java.util.Scanner;

public class FruitJuice {
	int product_code;
	 String Flavour;
	 String pack_type;
	 int pack_size;  
	 int product_price;

	 public FruitJuice()
	 {
		 product_code=0;
		  Flavour="";
		 pack_type="";
		  pack_size=0;
		 product_price=0;
	 }
	 public void input()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the Flavour ");
		 
		 Flavour=s.nextLine();
		 System.out.println("Enter Pack Type:");
		 pack_type=s.nextLine();
		 
		 System.out.println("Enter Pack size:");
		 pack_size=s.nextInt();
		
		 System.out.println("Enter Product code:");
		 product_price=s.nextInt();
		 s.close();
	 }
	 public void discount()
	 {
		 product_price-=10;
	 }
	 public void display()
	 {
		 System.out.println("Product Code:"+product_code);
		 System.out.println("Flavour:"+Flavour);
		 System.out.println("Pack Type:"+pack_type);
		 System.out.println("Pack Size:"+pack_size);
		 System.out.println("Product Price:"+product_price);
	 }
	

	 
	public static void main(String[] args) {
		
FruitJuice FJ=new FruitJuice();
FJ.input();
FJ.discount();
FJ.display();
	}
}

	
