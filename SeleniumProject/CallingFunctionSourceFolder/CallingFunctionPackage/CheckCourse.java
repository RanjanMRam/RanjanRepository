package CallingFunctionPackage;

public class CheckCourse {
	
	public static K getfees(String Course)
	{
		if(Course.equalsIgnoreCase("CSE"))
			return new CSE();
		else if(Course.equalsIgnoreCase("ECE"))
			return new ECE();
		else
		return null;
		
	}

}
