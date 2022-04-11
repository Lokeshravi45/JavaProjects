package innerclas;

abstract  class anonymousinnerclass {

		   public abstract void display();
		}

		 class innerClassAssisted3 {

		public static void main(String[] args) {
		anonymousinnerclass i = new anonymousinnerclass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}

