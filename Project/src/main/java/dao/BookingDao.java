package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnecrtion;
import model.BookService;

public class BookingDao {
	public static void insertBooiking(BookService b) {
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="insert into book_services(cid,sid,booking_price,booking_status,payment_status) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, b.getCid());
			pst.setInt(2, b.getSid());
			pst.setInt(3, b.getSprice());
			pst.setString(4, b.getBooking_status());
			pst.setString(5, b.getPayment_status());
			pst.executeUpdate();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<BookService> getPendingServiceByCid(int id){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="select * from book_services where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				BookService b = new BookService();
				b.setBid(rs.getInt("bid"));
				b.setCid(rs.getInt("cid"));
				b.setSid(rs.getInt("sid"));
				b.setSprice(rs.getInt("booking_price"));
				b.setBooking_status(rs.getString("booking_status"));
				b.setPayment_status(rs.getString("payment_status"));
				list.add(b);
			}
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static List<BookService> getPendingServiceBySid(int id){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="select * from book_services where sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				BookService b = new BookService();
				b.setBid(rs.getInt("bid"));
				b.setCid(rs.getInt("cid"));
				b.setSid(rs.getInt("sid"));
				b.setSprice(rs.getInt("booking_price"));
				b.setBooking_status(rs.getString("booking_status"));
				b.setPayment_status(rs.getString("payment_status"));
				list.add(b);
			}
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
