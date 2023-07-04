package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from user where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs =pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static Model loginUser(Model m) {
		Model m1 = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from user where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, m.getEmail());
			pst.setString(2, m.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				m1 = new Model();
				m1.setId(rs.getInt("id"));
				m1.setName(rs.getString("name"));
				m1.setContact(rs.getLong("contact"));
				m1.setAddress(rs.getString("address"));
				m1.setEmail(rs.getString("email"));
				m1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m1;
	}
	public static List<Model> getAllUsers(){
		List<Model> list = new ArrayList<Model>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from user";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Model m1 = new Model();
				m1.setId(rs.getInt("id"));
				m1.setName(rs.getString("name"));
				m1.setContact(rs.getLong("contact"));
				m1.setAddress(rs.getString("address"));
				m1.setEmail(rs.getString("email"));
				m1.setPassword(rs.getString("password"));
				list.add(m1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
