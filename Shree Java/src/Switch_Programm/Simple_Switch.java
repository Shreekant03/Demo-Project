package Switch_Programm;

public class Simple_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Simple_Switch s=new Simple_Switch();
		s.switch_test_integer(2);
		s.switch_test_character('A');
	}
	public void switch_test_integer(int choice)
	{
		switch(choice)
		{
			case 1:
				System.out.println("In Case 1");
				break;
			case 2:
				System.out.println("In Case 2");
				break;
			default:
				System.out.println("In Default Case");
				break;
		}
	}
	
	public void switch_test_character(char choice)
	{
		switch(choice)
		{
			case 'a':
				System.out.println("In Case a");
				break;
			case 'b':
				System.out.println("In Case b");
				break;
			default:
				System.out.println("In Default Case");
				break;
		}
	}
}
