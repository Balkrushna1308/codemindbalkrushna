class One extends Thread
{
	 synchronized void printData()
	{
		for(int i=0;i<10;i++)
			System.out.print(i);
		System.out.println();
		System.out.println(Thread.currentThread());
	
	}

	public void run()
		{
			this.printData();
		}
}


class ThreasExecution
{
	public static void main(String[] args)throws Exception {
		One t1=new One();
		One t2=new One();
		One t3=new One();
		t1.start();
		//t2.join();
		t2.start();
		//t3.join();
		t3.start();
		}
}