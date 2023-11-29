import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
	public static void main(String[] args)throws Exception {
		Socket s=new Socket("localhost",12345);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		String str="";
		while(str!="Bye")
		{
			str=sc.nextLine();
			dout.writeUTF(str);
			DataInputStream din=new DataInputStream(s.getInputStream());
			System.out.println("Server Says: "+din.readUTF());
		}
				
	}
}