package CallingFunctionPackage;

public class TypeCastB extends TypeCastA{

	void show2()
	{
		System.out.println("SubClass is Called");
	}
	public static void main(String[] args)
	{
		TypeCastA A;
		A=new TypeCastA();
		TypeCastB B=(TypeCastB)A;
		B.show1();
		B.show2();
		                                                                                                                                 
	}

}
