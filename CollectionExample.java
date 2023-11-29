import java.util.*;
class CollectionExample
{
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(21);
		al.add(38);
		System.out.println(al);
		
		List<Integer> al1=new ArrayList<>(Arrays.asList(33,67,89,90));
		// al1.addAll(al,34,56,78,90);
		System.out.println(al1);
		Collections.addAll(al,12,56,78,90,34);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		Collections.reverse(al);
		System.out.println(al);
	}
}