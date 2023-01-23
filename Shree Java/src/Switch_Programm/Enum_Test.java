package Switch_Programm;

public class Enum_Test {
	
		enum Month {January, February, March, April, May, June, July, August};
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Enum_Test e=new Enum_Test();
			e.useEnum();
		}
		
		public void useEnum()
		{
			Month m=Month.August;
			switch(m)
			{
				case January:
					System.out.println("January Month");
					break;
				case February:
					System.out.println("February Month");
					break;
				case August:
					System.out.println("August Month");
					break;
				default:
					System.out.println("Please provide Correct Month");
			}
			
			for(Month x:Month.values())
			{
				System.out.println(x);
			}
		}
	}
