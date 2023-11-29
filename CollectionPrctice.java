import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionPrctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("ASD");
		al.add(12.45);
		al.add(3.4f);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		LinkedList ll=new LinkedList();
		ll.add("Software");
		ll.add(123);
		ll.add(12.12);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
		// ArrayList<Integer> al1=new ArrayList<Integer>();
		// al1.add(1);
		// al1.add(12);
		// al1.add(12);
		// al1.add(12);
		// al1.add(null);
		// al1.add(null);
		
		// LinkedList<String> ll1=new LinkedList<String>();
		// ll1.add("ASD");
		// ll1.add("XYZ");
		// ll1.add("PQR");
		// ll1.add("ASD");
		// ll1.add("ASD");
		// ll1.add(null);
		// ll1.add(null);
		// ll1.add(null);
		
		// System.out.println(al1 +"\n"+ll1);
		
		// al1.addAll(al);
		// System.out.println(al1);
		
		// Vector<Double> v=new Vector<Double>();
		// v.add(1.23);
		// v.add(2.4);
		// v.add(4.56);
		// v.add(4.56);
		// v.add(null);
		// v.add(null);
		// System.out.println(v);
		
		// Stack<String> s=new Stack<String>();
		// s.add("X");
		// s.add("A");
		// s.add(null);
		// s.add(null);
		// s.add("A");
		// s.add("Y");
		// System.out.println(s);
		// s.remove(0);
		// System.out.println(s);
		
		// al1.removeAll(al);
		// System.out.println(al1);
		
		

	}

}
