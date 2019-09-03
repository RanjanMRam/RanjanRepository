package CallingFunctionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person  {
	String Name;
	int Age;

	public void inputdetails() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		Name=br.readLine();
		System.out.println("Enter the age");
		Age=Integer.parseInt(br.readLine());
		
		
	}
	public void check() throws IOException
	{
		if (Age<=30)
			System.out.println(Name+" is Young");
		else if (Age<=50)
			System.out.println(Name+" is Middle Aged");
		else
			System.out.println(Name+" is Old");
		
	}
	
	public void talk()
	{
		System.out.println("I am  "+Name);
		System.out.println("My age is  "+Age);
	}
	

}
