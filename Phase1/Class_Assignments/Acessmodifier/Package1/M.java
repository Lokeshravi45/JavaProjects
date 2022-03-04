package Acessmodifier;

public class M {
			
		 private  int i=20;
		 
		long l=1000;
		 
		 protected float f=123f;
		 
		 public void methodPublic(){
			 
			 methodPrivate();
		 }
		  protected void methodProtected()
		  {
			  methodPrivate();
		  }
		  
		  void methodDefault()
		  {
			  methodPrivate();
		  }
	        private void methodPrivate(){
	 	
	     System.out.println("Class M:Methode private");
	     System.out.println("value of private i "+i);
	     System.out.println("value of long l "+l);
	     System.out.println("value of Float f "+f);
		  }

	}

