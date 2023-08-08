package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import connection.DBConnection;
import model.User;

public class UserDao {
	public static void insertUser(User u) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
	}
	public static User loginUser(User u) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql="from User u where u.email=:email and u.password=:password";
		Query q = session.createQuery(hql);
		q.setParameter("email", u.getEmail());
		q.setParameter("password", u.getPassword());
		List list =q.list();
		User u1 = (User)list.get(0);
		tx.commit();
		session.close();
		return u1;
	}
	public static User getUserById(int id) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		User u = session.get(User.class, id);
		tx.commit();
		session.close();
		return u;
	}
	
	public static void updateUser(User u) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql="update User u set u.name=:name,u.contact=:contact,u.address=:address,u.email=:email,u.password=:password where u.id=:id";
//		String hql="update User u set u.name=?1,u.contact=?2,u.address=?3,u.email=:email,u.password=:password where u.id=:id";
		Query q = session.createQuery(hql);
		q.setParameter("email", u.getEmail());
		q.setParameter("password", u.getPassword());
		List list =q.list();
		User u1 = (User)list.get(0);
		tx.commit();
		session.close();
	}
	public static void deleteUser(int id) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		User u = session.get(User.class, id);
		session.delete(u);
		tx.commit();
		session.close();
	}
}
