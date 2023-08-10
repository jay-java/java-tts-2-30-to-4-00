package core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private long contact;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, long contact) {
		super();
		System.out.println("setting values by cons");
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setting ID");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		System.out.println("setting contact");
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", list=" + list + ", set=" + set
				+ ", map=" + map + "]";
	}
	
}
