package Operator;

public class Arithmatic_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//addition		
		int a=12, b=34, c; 
c=a+b;
System.out.println("Addition is :"+c);

//Subtraction
double x=12.34, y=56.78, z;
z=x-y;
System.out.println("Subtraction is :"+z);

z=y-x;
System.out.println("Subtraction is :"+z);

//Multiplication
int n=2, s=8;
c=s*n;
System.out.println("Multiplication is :"+c);

//Division
z=x/y;
System.out.println("Division is in Double :"+z);

z=(double)a/b;
System.out.println("Division is in double of two integers :"+z);

float m;
m=(float)(x/y);
System.out.println("Division is in float :"+m);

m=(float)(a/b);
System.out.println("Division is in float of two integers :"+m);

//Modulus    --it returns remainder
double f=45, g=12;
int e;
e=(int)(f % g);
System.out.println("Modulus :"+e);

double d=12, j=13;
int k;
k=(int)(d % j);
System.out.println("Modulus :"+k);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
