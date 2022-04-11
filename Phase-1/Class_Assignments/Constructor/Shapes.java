package Assignment2;

public class Shapes {
    int S;
	int R;
	int D;
	
		
	 Shapes(int a)
	{
		S=(a*a);
	}
	 
	 Shapes(int w,float l)
	 {
		 R= (int) (w*l);
	 }
	 Shapes(double r)
	 {
		D=(int) (3.14*(r*r));
	 }
	
	void display()
	{
		System.out.println(S+" "+R+" "+D);
		
	}

	public static void main(String[] args) {
	  	
     Shapes s1=new Shapes(7,2);
  //  Shapes s2=new Shapes(2,3);
    //   Shapes s3=new Shapes(2.5f);
        s1.display();
     //   s2.display();
     //   s3.display();
       
	

	}

}
