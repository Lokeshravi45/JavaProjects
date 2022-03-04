package Assignment2;

class students {

	    String name;
	    int age;
	    char ch ;//section(char type)
	    char g;  //gender (char type)
	    int subject1=0;
	    int subject2;
	    int subject3;
	    public students(String name,int age,char ch,char g,int subject1,int subject2,int subject3)//constructor
	    {
	    	this.name=name;
	    	this.age=age;
	    	this.ch=ch;
	    	this.g=g;
	    	this.subject1=subject1;
	    	this.subject2=subject2;
	    	this.subject3=subject3;
	    		
	    }
	    public students(String name,int age,char ch,char g,int subject2,int subject3)
	    
	    {
	    	this.name=name;
	    	this.age=age;
	    	this.ch=ch;
	    	this.g=g;
	    	this.subject2=subject2;
	    	this.subject3=subject3;
	    }
	    public String toString()
	    {
	    return name+" "+age+" "+ch+""+g+" "+subject1+" "+subject2+" "+subject3;
	    
	    }
	    public int total()
	    {
	    	return subject1 +subject2+subject3;
	    }	    
	    
	    
	    
	 
	    public static void main(String[] args) {
	    //	System.out.println("hello");
		students s1=new students("name1",20,'A','M',10,20,40);
		students s2=new students("name2",21,'A','F',30,50,40);
		students s3=new students("name3",22,'A','F',90,100,80);
		//students s4=new students("name4",23,'A','M',80,29,90);
		System.out.println(s1.subject1);
		System.out.println(s1.subject2);
		System.out.println(s1.subject3);
		System.out.println("the total value of student S1 "+s1.total());
		System.out.println(s2.subject1);
		System.out.println(s2.subject2);
		System.out.println(s2.subject3);
		System.out.println("the total value of student s2 "+s2.total());
		System.out.println(s3.subject1);
		System.out.println(s3.subject2);
		System.out.println(s3.subject3);
		System.out.println("the total value of student s3 "+s3.total());
	    
	    }
}
	    


