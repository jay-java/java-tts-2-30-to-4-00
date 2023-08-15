package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByInterface implements InitializingBean,DisposableBean{
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

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean start");
	}
}
