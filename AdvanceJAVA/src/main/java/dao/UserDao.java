package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Model;

public class UserDao {
	public static void insertUser(Model m) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into user(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, m.getName());
			pst.setLong(2, m.getContact());
			pst.setString(3, m.getAddress());
			pst.setString(4, m.getEmail());
			pst.setString(5, m.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
