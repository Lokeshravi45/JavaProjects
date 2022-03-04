package Array;

public class sum {

	public static void main(String[] args) {
		int a[]={7,6,3,4};
		int b[]={7,9,7,2};
		int c[]=new int[4];
		
	//for(int i=0;i < a.length;i++)
	//System.out.println(+a[i]);

	//for(int i=0;i < b.length;i++)
		//System.out.println(+b[i]);
	
	for(int i=0;i<a.length;i++)
	{
	c[i]=a[i]+b[i];
	System.out.println("C of array is " +c[i] );
	}
}
}


