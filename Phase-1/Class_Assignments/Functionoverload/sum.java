package funoverload;

public class sum {
	
		int i;
		public int Calculate(int a,int b)
		{
			
			return (a+b);
		}
		public float Calculate(float a,float b)
		{
			 i = (int) (3.14*a*b);
			 return i;
		}
		int Calculate(int l,float w)
		{
			return (int) (l*w);
		}

		public static void main(String[] args) {
			
			sum s=new sum();
			System.out.println(s.Calculate(10,20));
			System.out.println(s.Calculate(10f,20f));
			System.out.println(s.Calculate(2,3f));
		}
		}