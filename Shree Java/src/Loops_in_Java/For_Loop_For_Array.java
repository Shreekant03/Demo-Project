package Loops_in_Java;

public class For_Loop_For_Array {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			For_Loop_For_Array f=new For_Loop_For_Array();
			f.one_dimensional_array();
		}
		
		public void one_dimensional_array()
		{
			
			//Normal For Loop
			int y[]=new int[5];		//declaration of array
			y[0]=78;
			y[1]=45;
			y[2]=89;
			y[3]=11;
			
			for(int i=0;i<y.length;i++)
			{
				System.out.println(y[i]);
			}
			
			//For Each Version of For Loop
			System.out.println("For Each Version of For Loop");
			for(int z:y)
			{
				System.out.println(z);
			}
			

			//Character Array Using normal For and for each version 
			char q[]= {'w','e','l','c','o','m','e'};
			
			for(int i=0;i<q.length;i++)
			{
				System.out.print(q[i]);	
			}
			System.out.println();
		
			
			//Character Array Using for each version
			for(char s:q)
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}

