package calc;

import java.util.*;


public class Prime {
	
		public void prime(int a)
		{
			String s;
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0) {
					count=count+1;
					
				}
				
				
			}
			if(count==2)
			{
				
				System.out.println(a+" is prime");
					
			}
			else
			{
				System.out.println(a+" is not prime");
				
			}
			
		}
	}


