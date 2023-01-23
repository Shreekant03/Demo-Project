package Exception_Handling;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	
	public class Test_Exception {

		int x;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Test_Exception t1=new Test_Exception();
			t1.handleException(5, 0);
		}
		
		public void handleException(int m,int n)
		{
			int z[]= {5,2,5};
			try
			{
				x=z[1]/z[0];
				//x=m/n;
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println("I am here");
			}
			System.out.println("Division is : "+x);
		}
	}

