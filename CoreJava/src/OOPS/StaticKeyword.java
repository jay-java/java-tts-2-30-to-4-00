package OOPS;
class Data{
	int id;
	String name;
	static String cname = "TOPS";
	Data(int id, String name){
		this.id=id;
		this.name=name;
	}
	public void showData() {
		System.out.println("id = "+id+"name = "+name+" cname = "+cname);
	}
	public static void call(){
		System.out.println("static meethod in data class");
	}
	static {
		System.out.println("static block in data class");
	}
}
public class StaticKeyword {
	static {
		System.out.println("static block in main class");
	}
	public static void main(String[] args) {
		Data d =new Data(12,"java");
		d.showData();
		Data.call();
		Data d1 =new Data(13,"python");
		d1.showData();
	}
}
