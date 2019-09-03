package CallingFunctionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int id;
	String name;
	
	Employee(int i,String n)
	{
		id=i;
		name=n;
	}
	
	public static void main(String args[]) throws IOException
	{
		Employee arr[]=new Employee[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int j=0;j<5;j++)
		{
			
			System.out.println("Enter Name of the Employee"+(j+1));
			String n1=br.readLine();
			System.out.println("Enter If of thevEmployee"+(j+1));
			int i1=Integer.parseInt(br.readLine());
			arr[j]=new Employee(i1,n1);
			
		}
		System.out.println(arr.length);
		System.out.println("Details of all the Employees");
		
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("Employee"+(k+1)+" details are"+arr[k].id+","+arr[k].name);
		}
			
	}

}
