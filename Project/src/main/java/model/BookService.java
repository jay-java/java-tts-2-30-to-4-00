package model;

public class BookService {
	private int bid,cid,sid,ser_id,sprice;
	private String booking_status,payment_status;
	
	public int getSer_id() {
		return ser_id;
	}
	public void setSer_id(int ser_id) {
		this.ser_id = ser_id;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSprice() {
		return sprice;
	}
	public void setSprice(int sprice) {
		this.sprice = sprice;
	}
	public String getBooking_status() {
		return booking_status;
	}
	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	
	@Override
	public String toString() {
		return "BookService [bid=" + bid + ", cid=" + cid + ", sid=" + sid + ", ser_id=" + ser_id + ", sprice=" + sprice
				+ ", booking_status=" + booking_status + ", payment_status=" + payment_status + "]";
	}
	
}
