package Innerclass;

public class Member_inner {
	private int data=30;
	
	void display()
	{
		System.out.println("I am inside the outer Class....");
	}
	class Inner
	{
		private int data=20;
		
	void msg()
	{
		Member_inner.this.display();
		System.out.println(data);
	}
	void display()
	{
		System.out.println("I am inside of inner class...");
	}
	}
	

	public static void main(String[] args) {
		Member_inner obj=new Member_inner();
		Member_inner.Inner in=obj.new Inner();
		in.msg();
		in.display();
		obj.display();
		

	}

}
