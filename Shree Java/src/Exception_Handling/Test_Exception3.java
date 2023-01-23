package Exception_Handling;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class Test_Exception3 {

		public static void main(String[] args) throws FileNotFoundException, InterruptedException {
			// TODO Auto-generated method stub
			
			Test_Exception3 t3=new Test_Exception3();
			t3.slowDown();
		}
		
		public void slowDown() throws InterruptedException, FileNotFoundException
		{
			System.out.println("Hi");
			Thread.sleep(4000);
			
			System.out.println("Hello");
			Thread.sleep(3000);
			
			System.out.println("Bye");
			Thread.sleep(2000);
			
			System.out.println("Carry On");
			
			
			File f=new File("Abc.txt");
			FileInputStream fin=new FileInputStream(f);
		}

	}

