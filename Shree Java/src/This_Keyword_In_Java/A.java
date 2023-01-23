package This_Keyword_In_Java;

//passing this as parameter to constructor
public class A {
	
	int x,y;
	
	public A()
	{
		x=12;
		y=34;
		B b1=new B(this);
	}
}
