package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectoreDemo {
	public static void main(String[] args) {
		Vector vr  = new Vector();
		vr.add(1);
		vr.add(2324544);
		vr.add("java");
		vr.add(false);
		vr.add(454.4);
		vr.add('d');
		System.out.println(vr);
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
