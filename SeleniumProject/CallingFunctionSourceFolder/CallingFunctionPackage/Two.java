package CallingFunctionPackage;

import java.io.IOException;

public class Two extends One {
	void Calculate(int x)
	{
		System.out.println("Cube of a number is "+x*x*x);
	}
	
	public static void main(String[] args) throws IOException
	{
        One O= new One();
		One T=new Two();
		Two G=new Two();
		O.Calculate(8);
		T.Calculate(8);
		G.Calculate(8);
		System.out.println(O.hashCode());
		System.out.println(T.hashCode());
		System.out.println(G.hashCode());
		
	}
}
