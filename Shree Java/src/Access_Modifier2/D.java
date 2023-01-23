package Access_Modifier2;

import Access_Modifier.A;

public class D extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d1=new D();
		d1.getA();		//public accessibility
		d1.getD();		//protected accessibility
	}

}

