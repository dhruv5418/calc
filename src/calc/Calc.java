package calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner i = new Scanner(System.in); 
		
		int a=i.nextInt();
		int b=i.nextInt();
		System.out.println("Enter Operater");
		String g =i.nextLine();
		int c;
		switch(g) {
		case "+":	c=a+b;
				System.out.println("Addition=" +c); 
				break;
		case 20:System.out.println("20"); 
				break;
		case 30:System.out.println("30"); 
				break;
		case "^":c=a^b;
				System.out.println("Power is="+c); 
		break;		
		default:System.out.println("Invalid value entered"); 
				break;		
	}

}
