package Acessmodifier;

public class P {

	public static void main(String[] args) {
		new M().methodPublic();
		new M().methodProtected();
		new M().methodDefault();
		//System.out.println("Value of long "+new M().l);
		
		new N().methodPublic();
		new N().methodProtected();
		new N().methodDefault();
		//System.out.println("Value of long "+new N().A);
			
	}

	}

