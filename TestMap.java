import java.util.*;
class TestMap
{
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		System.out.println(hm.put(3,"Aishwarya"));
		System.out.println(hm.put(1,"Pranav"));
		hm.put(2,"Ajay");
		System.out.println(hm.put(3,"Aishwarya"));
		hm.put(0,"Aishwarya");
		hm.put(null,null);
		System.out.println(hm);
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("Z","TYBTECH");
		tm.put("a","BTECH");
		tm.put("A","SYBTECH");
		tm.put("B","SYBTECH");
		tm.put(null,null);
		System.out.println(tm);
		TreeMap<String,String> tm1=new TreeMap<>();
		tm1.putAll(tm);
		System.out.println(tm1);

	}
}