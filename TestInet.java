import java.net.*;
class TestInet
{
	public static void main(String[] args)throws Exception {
		InetAddress ip=InetAddress.getByName("www.goole.com");
		System.out.println("Host: "+ip.getHostName());
		System.out.println("Host: "+ip.getHostAddress());

	}
}