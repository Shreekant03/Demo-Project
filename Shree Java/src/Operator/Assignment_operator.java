package Operator;

public class Assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment Operator
		// = Equal to

		int a = 45, b = 3;

		// += Addition Equal to
		a = a += 23; // a=a+=23 = 45+23=68
		System.out.println("value of a :" + a);

		a += b; // a=a+b now a=68+3=71
		System.out.println("value of a :" + a);

		// -= Subtraction Equal to
		a = a -= 23; // 71-23=48
		System.out.println("value of a :" + a);

		// *= Multiplication Equal to
		b *= a; // b=b*a now a=48
		System.out.println("value of b :" + b);

		// /= Division Equal to
		b /= a; // b=b/a now a=48
		System.out.println("value of b :" + b);

		// >>= Grater than equal to
		int c = 30, d = 32;
		c >>= 2; // c=c>>2
		System.out.println("value of c :" + c);

		// <<= Less than equal to
		d <<= 3; // c=c<<3
		System.out.println("value of d :" + d);

	}

}
