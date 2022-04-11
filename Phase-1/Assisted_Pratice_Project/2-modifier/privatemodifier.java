package AssistedPractice;

public class privatemodifier {
	    private String name;

	    // getter method
	    public String getName() {
	        return this.name;
	    }
	    // setter method
	    public void setName(String name) {
	        this.name= name;
	    }

	    public static void main(String[] main){
	    	privatemodifier d = new privatemodifier();

	        // access the private variable using the getter and setter
	        d.setName("Set private string");
	        System.out.println(d.getName());
	    }
	}