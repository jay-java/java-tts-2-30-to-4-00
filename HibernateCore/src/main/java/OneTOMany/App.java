package OneTOMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("What is JAVA");
		
		Question q2 = new Question();
		q2.setId(2);
		q2.setQuestion("What is Python");
		
		
		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAnswer("java OOP");

		Answer a2 = new Answer();
		a2.setId(2);
		a2.setAnswer("Web development");

		Answer a3 = new Answer();
		a3.setId(3);
		a3.setAnswer("Python interpreted");

		Answer a4 = new Answer();
		a4.setId(4);
		a4.setAnswer("For ML,DS");
		
		List<Answer> alist1 = new ArrayList<Answer>();
		alist1.add(a1);
		alist1.add(a2);
		
		List<Answer> alist2 = new ArrayList<Answer>();
		alist2.add(a3);
		alist2.add(a4);
		
		q1.setAnswers(alist1);
		q2.setAnswers(alist2);
		
		a1.setQuestion(q1);
		a2.setQuestion(q1);
		
		a3.setQuestion(q2);
		a4.setQuestion(q2);
		
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		
		tx.commit();
		session.close();
		sf.close();
		
	}
}
