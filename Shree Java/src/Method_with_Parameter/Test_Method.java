package Method_with_Parameter;

public class Test_Method {
static int x=90;
int z=75;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=34, b=56, c=12;
		sum1(45,67);
		display1();
		sum1(a,b);
		display1();
		System.out.println("Value of x="+x);
		
		Test_Method tm1;   //Reference
		
		Test_Method tm=new Test_Method();  //object
		tm.divide();
		tm.average(a, b, c);
		tm.average(35, 67, 54);
		System.out.println("Value of z="+tm.z);
	
	}
		//Static Method
		
		public static void display1()
		{
			System.out.println("Employee Information");
			System.out.println("Name - Shrikant");
			System.out.println("Company - ATOS");
			
		}
		public static void sum1(int a, int b)
		{
			int c=a+b;
			System.out.println("Sum :"+c);
			
		}
		
		//Non-Static Method
		
		public void divide()
		{
			int x=98, y=3, z;
			z=x/y;
			System.out.println("Division ;"+z);
		}
		
		public void average(int a, int b, int c)
		{
			int avg=(a+b+c)/3;
			System.out.println("Average :"+avg);
			}
	private static void display() {
		// TODO Auto-generated method stub
		
	}
	private static void sum(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
