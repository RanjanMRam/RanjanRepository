package CallingFunctionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fact {
	int num;
   long fact=1;
	
	void factorial(int k)
	{
		
		if(k==1|| k==0)
		{
		System.out.println("Factorial of "+k+" ="+k);
		}
		else
		{ 
			num=k;
		while(num>0)
		{
			fact=fact*num;
			num=num-1;
		}
		
		System.out.println("Factorial of "+k+" ="+fact);
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{
		Fact F=new Fact();
		System.out.println("Enter the Number: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		F.factorial(Integer.parseInt(br.readLine()));


	}

	

}
