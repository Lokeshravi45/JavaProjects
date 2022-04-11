package Acessmodifier2;

import Acessmodifier.M;

public class Z extends M{


	
public  static void main(String[] args) {
			new M().methodPublic();
		//	new M().methodProtected();
			//new M().methodDefault();
			//new N().methodPublic();
			//new N().methodProtected();
		//	new N().methodDefault();
		 	//new P().callFromClassMN();
			new X().methodPublic();
			System.out.println("Class X:  default long bb: "+ new X().b);
			System.out.println("Class X:  protected float pf: "+ new X().Pf);
			System.out.println("Class X:  public char d: "+ new X().ch);
		}
	}
