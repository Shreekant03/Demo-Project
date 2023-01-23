package Operator;

public class Unary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a++;         //a=a+1
		System.out.println("Value of a :"+a);
		
		int b=45;
		b--;
		System.out.println("Value of b :"+b);
		
		
		//Postfix-- Older values get assigned first then it increments
		int x=34, y=56, z,m;
		
		z=x++;
		System.out.println("Value of x :"+x+" z="+z);
		
		//Prefix- Increments first then assigns the values
		m=++y;
		System.out.println("Value of x :"+m+" y="+y);
		
	}

}
