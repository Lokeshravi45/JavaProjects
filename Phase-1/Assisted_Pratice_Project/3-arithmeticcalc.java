package AssistedPractice;

import java.util.Scanner;

public class arithmeticcalc { 
	
	int x,y;
    static int z;
	public arithmeticcalc(int x ,int y)
	{
     this.x=x;
     this.y=y;
	}
	int add()
	{
		return x+y;
		
	}
     int sub()
     {
    	 return x-y;
     }
	int mul()
	{
		return x*y;
	}
	int div()
	{
		return x/y;
	}
	int mol()
	{
		return x%y;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number....");
		int x=sc.nextInt();
		System.out.println("Enter the Second number....");
		int y=sc.nextInt();
		System.out.println("Enter the Operator(+,-,*,/,%");
		String Op=sc.next();
		arithmeticcalc c=new arithmeticcalc(x,y);
		switch(Op)
		{
		case "+":
			 z = c.add();
			 break;
			 
		case "-":
			z=c.sub();
			break;
			
		case "*":
			z=c.mul();
			break;
		case "/":
			z=c.div();
			break;
			
		case "%":
			z=c.mol();
			break;
		default:
			System.out.println("Invaild");
		}
		System.out.println("Result is  :"+z);
		sc.close();
	}
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
