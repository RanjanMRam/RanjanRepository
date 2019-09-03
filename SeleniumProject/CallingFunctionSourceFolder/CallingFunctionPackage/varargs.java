package CallingFunctionPackage;

public class varargs {
	
 public void sum(int ...x)
 {
	 int temp=0;
	 
	 for (int i=0;i<x.length;i++)
	 {
		 temp=temp+x[i];
	 }
	 System.out.println("Sum is "+temp);
 }
 
 public static void main(String args[])
 {
	 varargs V =new varargs();
	V.sum(10,20,30,20,30,22,32,2341);
   

 }

}
