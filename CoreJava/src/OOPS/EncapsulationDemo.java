package OOPS;
class emp{
	private int id;
	private String name;
	private double salary;
	public void setId(int id) {
		this.id= id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary= salary;
	}
	public double getSaalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		emp e1 = new emp();
		e1.setId(12);
		e1.setName("java");
		e1.setSalary(23232.2);
		System.out.println(e1.getId());
		System.out.println(e1);
	}
}
