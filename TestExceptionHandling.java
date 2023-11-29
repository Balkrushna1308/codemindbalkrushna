import java.util.*;
class CustomeException
{

	ArrayList<String> username=new ArrayList<String>(Arrays.asList("Sam","Ram","Jhon"));
	void checkUsername(String username)throws Exception
	{
	if(this.username.contains(username))
	throw new Exception("Already Available try with different Username");
	else
	{
	this.username.add(username);
	System.out.println(this.username);
	}
	}
}
class TestExceptionHandling
{
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		String username;
		CustomeException c=new CustomeException();
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