import java.util.*;
class Custom
{
	ArrayList<String> username=new ArrayList<String>(Arrays.asList("Sam","Ram","johon"));
	void checkUsername(String username)throws Exception
	{
	if(this.username.contains(username))
	throw new Exception("Already Availble try with Different Username");
	else
	{
	this.username.add(username);
	System.out.println(this.username);
	}
	}
}
class TestCustom
{
	public static void main(String[] args)throws Exception {
		Custom c=new Custom();
		String username;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Username");
			username=sc.next();
			c.checkUsername(username);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Enter Username");
			username=sc.next();
			c.checkUsername(username);
		}
	}
}