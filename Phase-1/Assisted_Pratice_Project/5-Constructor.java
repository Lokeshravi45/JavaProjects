package AssistedPractice;

class Constructor{
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	

	//public class constructorDemo {

	public static void main(String[] args) {

		Constructor emp1=new Constructor();
		Constructor emp2=new Constructor();

		emp1.display();
		emp2.display();
		}
	}

//paraconstructor

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}



public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}
}
