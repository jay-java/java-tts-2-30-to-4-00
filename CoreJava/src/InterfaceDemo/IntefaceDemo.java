package InterfaceDemo;

interface inter1{
	public void interface1();
	
	public static void interface4() {
		System.out.println("static in interface");
	}
}
interface inter2 extends inter1{
	public void interface2();
}
interface inter3{
	public void interface3();
}
class Intercall implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class IntefaceDemo {
	public static void main(String[] args) {
		Intercall i  = new Intercall();
		inter1.interface4();
		
	}
}
