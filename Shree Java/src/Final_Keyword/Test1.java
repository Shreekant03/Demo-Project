package Final_Keyword;

//if we have class as final we cant inherit
public final class Test1 {
	
	public void getData()
	{
		System.out.println("Inside getData method of Test Class");
	}

	
	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		t1.getData();
	}
}

