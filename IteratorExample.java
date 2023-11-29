import java.util.*;
import java.lang.*;
class IteratorExample
{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>(Arrays.asList("VBN","CN","TOC","JAVA"));
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			itr.remove();
			System.out.println(itr.next());
			
		}
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}