package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(454);
		set.add(0);
		set.add(-3453);
		set.add(1);
		set.add(3465656);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
