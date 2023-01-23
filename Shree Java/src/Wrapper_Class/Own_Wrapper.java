package Wrapper_Class;

public class Own_Wrapper {
		
		int z;
		public Own_Wrapper()
		{
			
		}
		
		public Own_Wrapper(int z)
		{
			this.z=z;
		}
		
		public int getValue()
		{
			return z;
		}
		
		public void setValue(int z)
		{
			this.z=z;
		}
		
		public String toString()
		{
			return Integer.toString(z);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Own_Wrapper o=new Own_Wrapper(25);
			System.out.println(o);
		}
	}


