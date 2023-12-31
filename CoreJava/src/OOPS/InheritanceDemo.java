package OOPS;

class A {
	public void classAmethod() {
		System.out.println("class A");
	}
}

class B extends A {
	public void classBmethod() {
		System.out.println("class B");
	}
}

class C extends B {
	public void classCmethod() {
		System.out.println("class C");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		B b = new B();
		b.classAmethod();
		b.classBmethod();
		C c = new C();
		c.classAmethod();
		c.classBmethod();
		c.classCmethod();
	}
}
