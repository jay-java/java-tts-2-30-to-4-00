package OOPS;
class Parent{
	public void parentMethod(){
		System.out.println("parent method");
	}
}
class Child1 extends Parent{
	public void child1Method(){
		System.out.println("child 1 method");
	}
}
class Child2 extends Parent{
	public void child2Method(){
		System.out.println("child 2 method");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Child1 c1=  new Child1();
		c1.parentMethod();
		c1.child1Method();
		Child2 c2 =new Child2();
		c2.parentMethod();
		c2.child2Method();
	}
}
