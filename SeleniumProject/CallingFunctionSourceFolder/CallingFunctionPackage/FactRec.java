package CallingFunctionPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

import CallingFunctionPackage.ADD;

public class FactRec {
	
	public static void main(String[] args) throws IOException
	{
		
		
		final double PI=(double)22/7;
		double r=15.15;
		double Area= PI*r*r;
		System.out.println("Area is "+ Area);
		NumberFormat obj=NumberFormat.getNumberInstance();
		
		obj.setMaximumFractionDigits(10);
		obj.setMaximumIntegerDigits(4);
		obj.setMinimumIntegerDigits(2);
		String str=obj.format(Area);
		System.out.println("Formatted Area is "+ str);
		
	}
	
	
	
	
	
	
	

}
