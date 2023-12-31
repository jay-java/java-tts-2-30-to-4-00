package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	private int id;
	private String name;
	private double per;
	private long contact;
	public Student(int id, String name, double per, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + ", contact=" + contact + "]";
	}
}
public class ListPractical {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ami", 33.3, 98864576);
		Student s2 = new Student(2, "shivam", 34.3, 94864576);
		Student s3 = new Student(3, "shwetal", 35.3, 985564576);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		
		for(Student s:list) {
			System.out.println(s);
		}
		
//		Iterator<Student> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
