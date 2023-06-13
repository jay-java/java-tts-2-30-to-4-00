package OOPS;
class P{
	public void call() {
		System.out.println("call method in P class");
	}
}
class Ch extends P{
	public void call() {
		super.call();
		System.out.println("call method in C class");
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		Ch c = new Ch();
		c.call();
	}
}
