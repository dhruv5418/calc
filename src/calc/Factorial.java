package calc;

public class Factorial{
	
    public int factorial(int a)
    {
    	int b=1;
    	if(a==0)
    	{
    		return b;
    	}
    	else {
    	for(int i=1;i<=a;i++)
    		b=b*i;
    	return b;
    	}
    
    }
}
