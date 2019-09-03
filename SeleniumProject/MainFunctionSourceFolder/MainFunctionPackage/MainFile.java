package MainFunctionPackage;

import java.io.IOException;


import org.testng.annotations.Test;

import CallingFunctionPackage.LoginLogout;
@Test
public class MainFile {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
        LoginLogout.login("ranjanmr1989@gmail.com","rmnajnar");
        LoginLogout.logout();
//		LoginLogout.frames();
//		LoginLogout.LaunchYoutube();
//      LoginLogout.numberpattern();
//		System.out.print("***********************************************************************************");
//      LoginLogout.numberPattern1();
//		System.out.print("***********************************************************************************");
//		LoginLogout.numberPattern2();
//		System.out.print("***********************************************************************************");
//		LoginLogout.numberPattern3();
//		System.out.print("***********************************************************************************");
//		LoginLogout.numberPattern4();
//		System.out.print("***********************************************************************************");
//		LoginLogout.numberPattern5();
//		System.out.print("***********************************************************************************");
//		LoginLogout.numberPattern6();
//		System.out.print("***********************************************************************************");
//    	
//    	LoginLogout.stringOperations();
//		System.err.println("Hello");		
//		LoginLogout.Read_Display();
//		LoginLogout.Integer_Parsing();
//		LoginLogout.StringTokens();
//		LoginLogout.fibonacci();		
//		LoginLogout.scannerzz();
//	    LoginLogout.ThreeDimensionalArray();
//	    LoginLogout.StringOperations();	
//		LoginLogout.StringBuf();
//	    LoginLogout.Pallindrome();
//		LoginLogout.ABC();
//	    Person Ranjan=new Person();
//		LoginLogout.frames();
//		LoginLogout.GoogleCurrencyCalculator();	
	//	LoginLogout.StringSplit("Ranjan1,Ranjan2,Ranjan3,Ranjan4,Ranjan5");
	}
}
