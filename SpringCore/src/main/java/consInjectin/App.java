package consInjectin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("consInjectin/myfile.xml");
		Data d1 = (Data)con.getBean("d1");
		System.out.println(d1);
	}
}
