package String_Method;

public class String_Buffer_Methods {
		
		public void String_Buffer_Methods()
		{
			StringBuffer str=new StringBuffer("Java");
			System.out.println(str);
			System.out.println(str.length());
			
			str.append("Programming");
			
			System.out.println(str);
			System.out.println(str.length());
			
			str.delete(2, 5);
			
			System.out.println(str);
			System.out.println(str.length());
			
			System.out.println("Reverse : "+str.reverse());
		}
		
		
		public static void main(String[] args) {
		
			String_Buffer_Methods sf=new String_Buffer_Methods();
			sf.String_Buffer_Methods();
			
		}

	}

