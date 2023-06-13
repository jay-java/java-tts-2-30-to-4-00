package OOPS;

class Overload {
	public void area(int l, int b) {
		System.out.println("rec are: "+(l*b));
	}
	public void area(int r) {
		System.out.println("circle are : "+(Math.PI*r*r));
	}

//	public void area(int l, int b) {
//
//	}
}

public class Overloading {
	public static void main(String[] args) {
		Overload o = new Overload();
		o.area(23);
		o.area(2, 6);
	}
}
