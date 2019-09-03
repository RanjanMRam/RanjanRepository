package CallingFunctionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FeesMainClass {
	 
	
	public static void main(String args[]) throws IOException
	{
		
    System.out.println("Enter the Course:");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	K f=CheckCourse.getfees(br.readLine());
	System.out.println("Fees is "+f.showfees());
	
	}
}
