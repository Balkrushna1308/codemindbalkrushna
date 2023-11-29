import java.util.*;
interface Cricket
{
	int no_of_playres=11;
	void showIt();
}
interface BaseBall extends Cricket
{
	void initialize();
} 
class Games
{
	String nation;
	Scanner sc=new Scanner(System.in);
	void inputIt()
	{
	System.out.println("Enter Name of Country");
	nation=sc.next();
	}
}
class Sports extends Games implements BaseBall 
{
	int total_sports;
	public void initialize()
	{
		System.out.println("Enter total number of Sports for: "+nation);
		total_sports=sc.nextInt();
	}
	public void showIt()
	{
		System.out.println("Name of Country: "+nation);
		System.out.println("Number of Sports: "+total_sports);
		System.out.println("Number of Players in Cricket Team: "+no_of_playres);
	}
}
class TestMultipleInheritance
{
	public static void main(String args[])
	{
		Sports s=new Sports();
		s.inputIt();
		s.initialize();
		s.showIt();
	}
}