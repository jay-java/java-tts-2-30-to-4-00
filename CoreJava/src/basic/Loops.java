package basic;
//1.for 2.while 3.do while 4.for each
public class Loops {
	public static void main(String[] args) {
		for(String s:args) {
			System.out.println(s);
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		int j = 1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		int k =6;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}
