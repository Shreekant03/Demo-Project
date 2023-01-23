package Operator;

public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ternary Operator ?:

		int a = 45, b = 50, c = 70, d = 12;

		int x = (a > b) ? c : d;
		System.out.println("value of x :" + x);

		int s = (a < b) ? c : d;
		System.out.println("value of s :" + s);

		char y = (a > b) ? 'q' : 'r';
		System.out.println("value of y :" + y);
		
		char f = (a < b) ? 'q' : 'r';
		System.out.println("value of f :" + f);

		boolean z = (a > b) ? true : false;
		System.out.println("value of z :" + z);
		
		boolean h = (a < b) ? true : false;
		System.out.println("value of h :" + h);
	}

}
