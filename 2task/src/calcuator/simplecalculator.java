package calcuator;

import java.util.Scanner;

public class simplecalculator {
	static int add(int a,int b)
   {
	int s=0;
	s=a+b;
	return(s);
	
 }
static int multiply(int a,int b)
{
	int m=1;
	m=a*b;
	return(m);
}
static void divide(int a,int b)
{
	try
	{
		int d=a/b;
		System.out.println(d);
	}
	catch(ArithmeticException e) {
		System.out.println("not possible");
	}
}


	public static void main(String[] args) {
		int a,b,s;
		Scanner K=new Scanner(System.in);
	    a=K.nextInt();
        b=K.nextInt();
        System.out.println(add(a,b));
        System.out.println(multiply(a,b));
        divide(a,b);
        
        
	}

}


	
