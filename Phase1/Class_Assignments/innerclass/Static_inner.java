package Innerclass;

public class Static_inner {

	static class USB{
	int usb2=2;
	int usb3=3;
	
	int gettotalport()
	{
		return usb2+usb3;
	}
	static void disp()
	{
		System.out.println("We are into static of inner class  ");
	}
	
	}


    //public  class Static_inner_main{
     public static void main(String[]args) {
	
	Static_inner.USB usb=new Static_inner.USB();
	System.out.println("Total port="+usb.gettotalport());
	Static_inner.USB.disp();
}
}
//create the object of static nested class;
    //using the name of outer class;

	
	
	
