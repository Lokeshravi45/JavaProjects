package Acessmodifier2;

public class X {


	private  int a= 159;
	long b = 254;
	protected float Pf = 543.33f;
	public char ch = 'X';
	public void methodPublic(){     // public method
		methodPrivate();
	}
	private void methodPrivate() {
		System.out.println("Class X: Value of private  int aa: "+ a);
	}
}
	
	

