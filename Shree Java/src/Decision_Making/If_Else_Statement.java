package Decision_Making;

public class If_Else_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=25;
		if ((a%2)==0)
		{
			System.out.println(a+" is Even");
		}
		else
		{
		System.out.println(a+" is Odd");	
		}
		
		int x=46, y=45, z=76;
		if ((x<y)&&(x<z))
		{
			System.out.println("x is Smaller");
		}
		else
		{
			System.out.println("x is Greater");
		}
		System.out.println("it is after Else Block");
}
}