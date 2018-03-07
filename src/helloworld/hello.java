package helloworld;

public class hello {

	public static void main(String[] args) {
		int a=1,b=2,c;
		System.out.print(a);
		System.out.print(b);
		c=a+b;
		System.out.print(c);
		while(c<100)
		{
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(c);
		}
	
	
	}
	

}
