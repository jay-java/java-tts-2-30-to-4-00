package basic;

//types 
//1.default
//2.parameterized
//3.copy
class area {
	int l, b;
	area() {
		System.out.println("defualt cons");
	}
	area(int i) {
		System.out.println("para  int cons " + i);
	}
	area(String name) {
		System.out.println("para String cons " + name);
	}
	area(int l, int b) {
		this.l = l;
		this.b = b;
		System.out.println("area of rect : " + (l * b));
	}
	
	public void run() {
		System.out.println("run method in area class");
	}
	public void calculatArea() {
		System.out.println("area of rec : " + (l * b));
	}
}
class newArea{
	int l,b;
	newArea(area a){
		this.l = a.l;
		this.b = a.b;
	}
	public void calculatArea() {
		System.out.println("area of rec : " + (l * b));
	}
}
public class ConstrucotrDemo {
	public static void main(String[] args) {
		area a = new area(12, 3);
		area a1 = new area();
		a.calculatArea();
		newArea n = new newArea(a);
		n.calculatArea();
	}
}
