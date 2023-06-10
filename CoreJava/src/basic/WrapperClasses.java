package basic;

public class WrapperClasses {
	public static void main(String[] args) {
		int i=1;
		System.out.println(i);
		Integer j = new Integer(12);
		System.out.println(j);
		String s = "1";
		int k = Integer.parseInt(s);
		double d  = Double.parseDouble(s);
		long l = Long.parseLong(s);
	}
}
