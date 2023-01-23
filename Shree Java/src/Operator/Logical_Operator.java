package Operator;

public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//  &&  Logical AND  Boolean
		boolean x=true,y=false, z;
		
		z=x && y;
		System.out.println("x && y :"+z);
		
		// || Logical OR  Boolean
		
		z=x || y;
		System.out.println("x || y :"+z);
		
		int a= 46, b=45, c=78;
		
		z= (a<b) && (a<c);
		System.out.println("x && y :"+z);
		
		z=(a<b) || (a<c);
		System.out.println("x || y :"+z);
		
		
		
		
		
		
	}

}
