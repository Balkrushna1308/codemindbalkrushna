class ValidateAge extends Exception
{
	ValidateAge(String str)
	{
	super(str);
	}
}
class Validate
{
	void validate(int age)throws ValidateAge
	{
	if(age<18)
	throw new ValidateAge("Not Valid for Voting");
	else
	System.out.println("Valid for Vote");
	}
}
class TestValidate
{
	public static void main(String args[]) throws Exception
	{
	Validate t=new Validate();
	try{
	t.validate(13);
	}
	catch(ValidateAge va)
	{
	System.out.println(va.getMessage());
	va.printStackTrace();
	t.validate(19);
	}
	}
}