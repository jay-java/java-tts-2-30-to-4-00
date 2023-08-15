package lifecycle;

public class BeanLife {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "BeanLife [a=" + a + ", b=" + b + "]";
	}
	
	public void beanStart() {
		System.out.println("bean started");
	}
	
	public void beanStopped() {
		System.out.println("bean stopped");
	}

}
