package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("lifecycle/myfile.xml");
		BeanLife b1 = (BeanLife)con.getBean("b1");
		System.out.println(b1);
		ByInterface b2 = (ByInterface)con.getBean("b2");
		System.out.println(b2);
		UsingAnnotation b3 = (UsingAnnotation)con.getBean("b3");
		System.out.println(b3);
		con.registerShutdownHook();
	}
}
