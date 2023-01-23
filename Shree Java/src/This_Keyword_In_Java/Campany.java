package This_Keyword_In_Java;

//passing this as parameter in method call
public class Campany {

	int comp_id;
	String comp_name;
	String comp_city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Campany c1 = new Campany();
	}

	public Campany() 
	{
		comp_id = 1234;
		comp_name = "ATOS";
		comp_city = "Pune";
		this.show();
		this.input(this);
	}

	public void input(Campany c2) 
	{
		c2.comp_id = 45712;
		c2.comp_name = "Wipro";
		c2.comp_city = "Mumbai";

		System.out.println(c2.comp_id);
		System.out.println(c2.comp_name);
		System.out.println(c2.comp_city);
	}

	public void show() 
	{
		System.out.println("Company ID :" + comp_id);
		System.out.println("Company Name :" + comp_name);
		System.out.println("Company City :" + comp_city);
	}
}
