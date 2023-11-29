import java.util.*;
class TestCustomeException
{
	public static void main(String[] args)throws ValidateAge {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age to Validate");
		int age=sc.nextInt();
		TestValidateAge t=new TestValidateAge();
		try
		{
			t.checkAge(age);
			System.out.println("From Try Block");
		}
		catch(ValidateAge va)
		{
			System.out.println(va.getMessage());
		}
	}
}