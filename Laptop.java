package MyPack;
public class Laptop
{
	int ram;
	int price;
	double processspeed;
	String brandname;
	public Laptop(int ram, int price,double processspeed,String brandname)
	{
		this.ram=ram;
		this.price=price;
		this.processspeed=processspeed;
		this.brandname=brandname;

	}
	public void display()
	{
		System.out.println("Brand Name: "+brandname);
		System.out.println("Ram: "+ram);
		System.out.println("Processor Speed: "+processspeed);
		System.out.println("Price: "+price);
	}
}