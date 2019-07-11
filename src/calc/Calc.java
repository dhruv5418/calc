package calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner i = new Scanner(System.in); 
	System.out.println("Enter Operation");
	char c = i.next().charAt(0); 	
	if(c=='+')
	{
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
	}
	else if(c=='-')
	{
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
	}
	else if(c=='*') {
		
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
	}
	else if(c=='/') {
		
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
	}
	else if(c=='%') {
		
		System.out.println("Enter two values");
		int a=i.nextInt();
		int b=i.nextInt();
	}
	

}
}
