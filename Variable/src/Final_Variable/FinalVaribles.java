package Final_Variable;

public class FinalVaribles {
//	final int a;  // final instance variable must be initialized		
	
	final int x=100;
	
	//declare a static blank final variable
	final static int y;
	
	final static int z=10;
	
	//instance method 
	void change()
	{
		//a=20;
//		x=30;  final variables can't be change 
//		z=50; or re assign
	}

	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ", y=" + y +"]";
	}
	
	
	//declare a static block 
	static
	{
		y=20;
		//z=80;  once initialized can't be reassigned
		System.out.println("value of Y : "+ y);
	}
	
}
