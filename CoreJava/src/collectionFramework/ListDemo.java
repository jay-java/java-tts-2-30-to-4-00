package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(1);
		list.add("java");
		list.add(1234566);
		list.add(3454.4);
		list.add(false);
		list.add('d');
		System.out.println(list);
		list.add(345);
		list.remove(4);
		System.out.println(list);
		System.out.println(list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
