package Test;


public class string2 {

	public static void main(String[] args) {
		String s="Vital Information Resource Under Seize"; 
		System.out.println(s);
		char c[] =s.toCharArray();
		System.out.println("First Letter of strings...");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' '&&(i==0)||(c[i-1]==' '))
					System.out.println(c[i]);
			}
	}
}

	
