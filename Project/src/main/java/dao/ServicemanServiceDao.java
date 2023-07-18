package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnecrtion;
import model.ServicemanServices;

public class ServicemanServiceDao {
	public static void insertService(ServicemanServices s) {
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql = "insert into service(s_id,s_name,s_price,s_duration,s_category) values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, s.getServiceman_id());
			pst.setString(2, s.getService_name());
			pst.setInt(3, s.getSprice());
			pst.setString(4, s.getService_duration());
			pst.setString(5, s.getService_category());
			pst.executeUpdate();
			System.out.println("service uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<ServicemanServices> getServiceListBySid(int id) {
		List<ServicemanServices> list = new ArrayList<ServicemanServices>();
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql = "select * from service where s_id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				ServicemanServices s = new ServicemanServices();
				s.setSid(rs.getInt("sid"));
				s.setServiceman_id(rs.getInt("s_id"));
				s.setService_name(rs.getString("s_name"));
				s.setSprice(rs.getInt("s_price"));
				s.setService_duration(rs.getString("s_duration"));
				s.setService_category(rs.getString("s_category"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static ServicemanServices getServiceBySid(int id) {
		ServicemanServices s = null;
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql = "select * from service where sid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				s = new ServicemanServices();
				s.setSid(rs.getInt("sid"));
				s.setServiceman_id(rs.getInt("s_id"));
				s.setService_name(rs.getString("s_name"));
				s.setSprice(rs.getInt("s_price"));
				s.setService_duration(rs.getString("s_duration"));
				s.setService_category(rs.getString("s_category"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	public static void updateService(ServicemanServices s) {
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql = "update service set s_name=?,s_price=?,s_duration=?,s_category=? where sid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getService_name());
			pst.setInt(2, s.getSprice());
			pst.setString(3, s.getService_duration());
			pst.setString(4, s.getService_category());
			pst.setInt(5, s.getSid());
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteService(int id) {
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql = "delete from service where sid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("data deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<ServicemanServices> getAllServices() {
		List<ServicemanServices> list = new ArrayList<ServicemanServices>();
		try {
			Connection con = DBConnecrtion.createConnection();
			String sql = "select * from service";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				ServicemanServices s = new ServicemanServices();
				s.setSid(rs.getInt("sid"));
				s.setServiceman_id(rs.getInt("s_id"));
				s.setService_name(rs.getString("s_name"));
				s.setSprice(rs.getInt("s_price"));
				s.setService_duration(rs.getString("s_duration"));
				s.setService_category(rs.getString("s_category"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
