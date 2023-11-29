import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student {
int roll,age;
String name;
	public Student(int roll,int age,String name) {
		// TODO Auto-generated constructor stub
		this.roll=roll;
		this.age=age;
		this.name=name;
	}
	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}

}

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al=new ArrayList<Student>();
Student s1=new Student(1,20,"asd");
Student s2=new Student(2,21,"pqr");
Student s3=new Student(3,19,"asdert");
al.add(s1);
al.add(s2);
al.add(s3);
System.out.println(al);
Collections.sort(al);

	}

}
