class TestValidateAge
{
	void checkAge(int age)throws ValidateAge
	{
	if(age<18)
	throw new ValidateAge("Not Valid for Voting");
	else
		System.out.println("Welcome for Voting");
	}
}