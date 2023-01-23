package Super_Keyword;

public class Job_Opportunity extends Account{
	
	String jd;
	public Job_Opportunity() {
		// TODO Auto-generated constructor stub
		jd="Needed a passinate Test Engineer";
	}
	
	public void show_info()
	{
		System.out.println(jd);
	}
	
	public void show_info(String e)
	{
		
	}
	public static void main(String[] args) {
		
		Job_Opportunity j=new Job_Opportunity();
		j.emp_info();
		j.emp_designation();
		j.show_info();
	}
	
}

