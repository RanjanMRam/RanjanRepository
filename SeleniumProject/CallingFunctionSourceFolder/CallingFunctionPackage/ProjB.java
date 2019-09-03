package CallingFunctionPackage;

public class ProjB {

	public static void main(String[] args) {
		ProjA A=new ProjA();
		A.x=A.x+1;
		A.display();
		ProjA B=new ProjA();
		B.display();

	}

}
