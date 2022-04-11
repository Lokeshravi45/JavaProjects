package Acessmodifier;

public class N {
		
		protected long A=110;
		
		  public int i=22;
		  
		   double d=555.5;
		   
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
		 	
		     System.out.println("Class N:Methode private ");
		     System.out.println("value of private i "+i); 
		     System.out.println("value of long l "+A);
		     System.out.println("value of double d "+d);
			  }
			  
		}
		
		
		
		
		
		
		
		
		
		


