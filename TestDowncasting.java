

class School
{
	 protected String study()
	{	
		String info="Study @ School:)";
		return info;
	}	
	
}
class College extends School
{		
	public  String study()
	{
		System.out.println("Using Super...");
		System.out.println("Accessing Super(School) class method"+super.study());
		String  msg="Study @ College";
		return msg;
	}
	public String  project()
	{
		String info="Doing Project  @ College";
		return info;
	}
}
public class TestDowncasting
{
	public static void main(String ar[])
	{
		School s=new School();
		String msg=s.study();		
		System.out.println(msg);
		s=new College();
		msg=s.study();
		System.out.println(msg); 
		if(s instanceof College)
		{
			//College c=(College)s;
			College c=new College();
			
			System.out.println(c.project());
		}
	
	}
}





