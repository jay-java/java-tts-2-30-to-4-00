package orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("orm/myfile.xml");
		Dao dao = (Dao)con.getBean("dao");
//		Model m1 = new Model(2, "python",9876543210l, "ahmedabad");
//		dao.insertUser(m1);
//		System.out.println("done");
		
//		Model m = dao.getModelById(2);
//		System.out.println(m);
		
//		List<Model> list = dao.getAllModel();
//		System.out.println(list);
//		
//		Model m1 = new Model(2, "kotlin",9876543210l, "ahmedabad");
//		dao.insertUser(m1);
		
		dao.deleteModel(1);
		System.out.println("deleted");
	}
}
