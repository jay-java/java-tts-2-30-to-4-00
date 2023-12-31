package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class Division{	//B
	public void divide() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i  = ");
		int i = sc.nextInt();
		System.out.println("entr j = ");
		int j = sc.nextInt();
		if(j>0) {
			int k = i / j;
			System.out.println(k);
		}
		else {
			throw new ArithmeticException();
		}
	}
}
public class ExceptionDemo {   //A
	public static void main(String[] args) {
		try {
			Division d =new Division();
			d.divide();
		} catch (ArithmeticException e) {
			System.out.println("denominator cannot be zero");
		}
		catch(InputMismatchException e) {
			System.out.println("denominator should  be numeric");
		}
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter i  = ");
//			int i = sc.nextInt();
//			System.out.println("entr j = ");
//			int j = sc.nextInt();
//			int k = i / j;
//			System.out.println(k);
//			System.exit(12);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should  be numeric");
//		} catch (Exception e) {
//			System.out.println("error");
//		}
//		finally {
//			System.out.println("this will exeucte everytime");
//		}
	}
}
