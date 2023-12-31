package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserData implements Serializable{
	int id;
	String name;
	double salary;
	String address;
	long contact;
	public UserData(int id, String name, double salary, String address, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", contact="
				+ contact + "]";
	}
}
public class SerilzationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		UserData u = new UserData(1, "java",34343.3, "ahmedabad", 987654321);
//		
//		FileOutputStream fos = new FileOutputStream("user.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(u);
//		oos.flush();
//		oos.close();
//		System.out.println("object storeds successfully");
		
		FileInputStream fis = new FileInputStream("user.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserData u1 = (UserData)ois.readObject();
		System.out.println(u1);
	}
}
