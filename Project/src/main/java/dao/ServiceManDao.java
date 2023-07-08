package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnecrtion;
import model.ServiceMan;

public class ServiceManDao {
	public static void insertData(ServiceMan s) {
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql="insert into serviceman(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setString(5, s.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email) {
		boolean flag =false;
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql="select * from serviceman where email=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static ServiceMan servicemanLogin(ServiceMan s) {
		ServiceMan s1 = null;
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql="select * from serviceman where email=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s1 = new ServiceMan();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}
	public static void updateData(ServiceMan s) {
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql="update serviceman set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setInt(5, s.getId());
			pst.executeUpdate();
			System.out.println("data updated");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
