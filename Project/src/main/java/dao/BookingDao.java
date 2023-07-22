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
			String sql="insert into book_services(cid,sid,ser_id,booking_price,booking_status,payment_status) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, b.getCid());
			pst.setInt(2, b.getSid());
			pst.setInt(3, b.getSer_id());
			pst.setInt(4, b.getSprice());
			pst.setString(5, b.getBooking_status());
			pst.setString(6, b.getPayment_status());
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
	public static boolean checkBookedService(int cid,int sid) {
		boolean flag = false;
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="select * from book_services where cid=? and sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			pst.setInt(2, sid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static List<BookService> getPendingServiceForCustomerByCid(int cid){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="select * from book_services where cid=? and booking_status='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
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
	public static List<BookService> getPendingServiceForServicemanByCid(int sid){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="select * from book_services where ser_id=? and booking_status='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
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
	public static void updateBookingStatus(int bid) {
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="update book_services set booking_status='confirm' where bid =?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, bid);
			pst.executeUpdate();
			System.out.println("status updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<BookService> getConfirmServiceForCustomer(int cid){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnecrtion.createConnection();
			String sql="select * from book_services where cid=? and booking_status='confirm'";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
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
