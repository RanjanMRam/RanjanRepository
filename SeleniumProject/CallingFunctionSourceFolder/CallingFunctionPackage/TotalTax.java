package CallingFunctionPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TotalTax {

	
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
//		System.out.println("Enter the StateName for which you need the total tax");
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String State=br.readLine();
		Class c=Class.forName("CallingFunctionPackage.Karnataka");
         Tax ref= (Tax) c.newInstance();
       double st= ref.statetax();
       double ct=3000.00;
       System.out.println("TotalTax is "+(ct+st));
	}

}
