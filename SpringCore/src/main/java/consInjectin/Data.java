package consInjectin;

public class Data {
	private int id;
	private String name;
	private long contact;

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(int id, String name, long contact) {
		super();
		System.out.println("settting value by para cons");
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Data(String id, String name, String contact) {
		System.out.println("settting value by para  -> String cons");
		this.id = Integer.parseInt(id);
		this.name = name;
		this.contact = Long.parseLong(contact);
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}
