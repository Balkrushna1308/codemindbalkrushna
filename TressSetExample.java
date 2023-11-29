import java.util.*;
import java.lang.*;
class TressSetExample
{
	public static void main(String[] args) {
		// Set<String> hs=new HashSet<>();
		// hs.add("Hello");
		// hs.add("hi");
		// hs.add("HI");
		// hs.add("hello");
		// hs.add("ASD");
		// hs.add("Hello");
		// //hs.add(null);
		// //hs.add(null);
		// System.out.println(hs);
		Set<String> tree=new TreeSet<>();
		tree.add("Hello");
		tree.add("HELLO");
		tree.add("ASD");
		tree.add("PQR");
		tree.add("Hello");
		System.out.println(tree);
		Iterator itr=tree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(String i:tree)
			System.out.println(i);

	}
}