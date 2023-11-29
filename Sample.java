class Sample
{
	Sample()
	{
		try{
			int c=12/0;
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			int c=12/2;
		}
	
	}
	public static void main(String[] args) {
		Sample s=new Sample();

	}

}