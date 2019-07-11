package calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner i = new Scanner(System.in); 
	System.out.println("Enter Operation");
	char c = i.next().charAt(0); 
	int d;
	if(c=='+')
	{
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
		d=a+b;
		System.out.println("Sum="+d);
	}
	else if(c=='-')
	{
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
		d=a-b;
		System.out.println("Substraction="+d);
	}
	else if(c=='*') {
		
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
		d=a*b;
		System.out.println("Multiplication="+d);
	}
	else if(c=='/') {
		
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
		d=a/b;
		System.out.println("Division="+d);
	}
	else if(c=='%') {
		
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
		d=a%b;
		System.out.println("Modulo="+d);
	}
	else if(c=='!')
	{
		System.out.println("Enter two values");
		int a=i.nextInt();
	}
	

}
}
