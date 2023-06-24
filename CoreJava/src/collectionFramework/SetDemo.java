package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("java");
		set.add('f');
		set.add(false);
		set.add(454.4);
		set.add(3465656);
		set.add(1);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
