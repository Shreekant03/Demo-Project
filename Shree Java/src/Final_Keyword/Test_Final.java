package Final_Keyword;

public class Test_Final {
	
	
	int n=45;
	
	final String str="Hello";
	
	public void get()
	{
		String str1=str+"Hi";		//you can access the final variable
						//Cant assign a value to final variable
		n=78;
		System.out.println("Value of n : "+n);
	}
	
	public final void show()
	{
		System.out.println("Inside Final Show Method");
	}
	
	public static void main(String[] args) {
		
		Test_Final t=new Test_Final();
		//t.get();
		t.show();
	}

}

