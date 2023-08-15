package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
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
	@PostConstruct
	public void beanstart() {
		System.out.println("bean start by annotation");
	}
	@PreDestroy
	public void beanstopped() {
		System.out.println("bean stopped by annotation");
	}
}
